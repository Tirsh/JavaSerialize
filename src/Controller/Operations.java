package Controller;

import Model.*;
import Model.Serialize.SaveToFile;
import ui.Output;

import java.util.List;

public class Operations {
    ColorSwitcher colorSwitcher;
    Settings settings;
    Loader loader;
    Output output;

    public Operations(Settings settings) {
        this.settings = settings;
        this.loader = new Loader(settings);
        this.colorSwitcher =  new ColorSwitcher(settings);
    }

    public List<String> getColorList(){
        return colorSwitcher.getColors();
    }
    public void changeColor(String color){
        colorSwitcher.setColor(color);
    }
    public boolean pictureIsLoaded(){
        return settings.isPictureIsLoaded();
    }
    public void showPicture(){
        Picture pic = new Picture(settings);
        output = new Output(pic);
        output.showPicture();
    }
    public List<String> loadPicList(){
        return loader.getPictureList();
    }
    public void choosePicture(String pic){
        loader.setPicture(pic);
    }

    public void saveSettings(){
        SaveToFile.saveData(settings.DATA_FILE, settings);
    }

}
