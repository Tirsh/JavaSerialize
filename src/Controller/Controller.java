package Controller;

import Model.Settings;
import ui.ConsoleInterface;

public class Controller {
    Settings settings;
    ConsoleInterface consoleInterface;
    Operations operations;

    public Controller() {
        settings = new Settings();
        operations = new Operations(settings);
        consoleInterface = new ConsoleInterface(operations);
    }
    public void run(){
        consoleInterface.startMenu();
    }
}
