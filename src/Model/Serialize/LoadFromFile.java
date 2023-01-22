package Model.Serialize;

import Model.Settings;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadFromFile {
    static public Settings loadData(String file) {
        Settings settings;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            settings = (Settings) objectInputStream.readObject();
            objectInputStream.close();
            return settings;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Что-то пошло не так");
            System.out.println("Файл базы не найден");
            return null;
        }
    }
}