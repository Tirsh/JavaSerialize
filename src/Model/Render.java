package Model;

import java.io.*;

public class Render {
    private static final String ANSI_RESET = "\u001B[0m";
    String dataFile;

    public Render(String dataFile) {
        this.dataFile = dataFile;
    }
    public String loadPicture() throws IOException {
        String fileName = "pic/" + dataFile;
        File picFile = new File(fileName);
        FileReader fr = new FileReader(picFile);
        BufferedReader br = new BufferedReader(fr);
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while((line = br.readLine()) != null){
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public String setColor(String data, String color){
        return color + data + ANSI_RESET;
    }
}
