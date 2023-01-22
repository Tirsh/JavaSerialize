package Model;

import Model.Serialize.LoadFromFile;

import java.io.Serializable;

public class Settings implements Serializable {
    public final String DATA_FILE = "settings.dat";
    private String currentColor;
    private String currentPicture;
    private boolean pictureIsLoaded;

    public Settings() {
        Settings data = LoadFromFile.loadData(DATA_FILE);
        if (data != null) {
            this.currentColor = data.currentColor;
            this.currentPicture = data.currentPicture;
            this.pictureIsLoaded = true;
        }
        else
            pictureIsLoaded = false;
    }

    public String getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(String currentColor) {
        this.currentColor = currentColor;
    }

    public String getCurrentPicture() {
        return currentPicture;
    }

    public void setCurrentPicture(String currentPicture) {
        this.currentPicture = currentPicture;
        pictureIsLoaded = true;
    }

    public boolean isPictureIsLoaded() {
        return pictureIsLoaded;
    }
}
