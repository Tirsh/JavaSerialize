package Model;

import Model.Settings;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Loader {
    List<String> pictureList;
    Settings settings;

    public Loader(Settings settings) {
        pictureList = getPicturesList();
        this.settings = settings;
    }
    private List<String> getPicturesList(){
        File dir = new File("pic");
        return Arrays.asList(dir.list());
    }

    public List<String> getPictureList() {
        return pictureList;
    }
    public void setPicture(String picture){
        settings.setCurrentPicture(picture);
    }
}
