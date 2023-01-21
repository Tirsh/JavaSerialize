import java.util.ArrayList;
import java.util.List;

public class Loader {
    List<Picture> pictureList;

    public Loader() {
        pictureList = createPicturesList();
    }
    private List<String> getFileList(){
        return null;
    }

    private List<Picture> createPicturesList(){
        List<Picture> listOfPictures = new ArrayList<>();
        return listOfPictures;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

}
