public class Picture{
    Settings settings;
    String dataFile;
    Render render;

    public Picture(Settings settings) {
        this.settings = settings;
        render = new Render(settings.currentPicture);
        dataFile = render.dataFile;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "dataFile='" + dataFile + '\'' +
                '}';
    }
}
