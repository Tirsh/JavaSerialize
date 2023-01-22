package Model;

import java.io.IOException;

public class Picture{
    Settings settings;
    String dataFile;
    Render render;

    public Picture(Settings settings) {
        this.settings = settings;
        render = new Render(settings.getCurrentPicture());
        try {
            dataFile = render.loadPicture();
            dataFile = render.setColor(dataFile, settings.getCurrentColor());
        } catch (IOException e) {
            dataFile = "Ошибка загрузки изображения!";
        }
    }

    @Override
    public String toString() {
        return dataFile;
    }
}
