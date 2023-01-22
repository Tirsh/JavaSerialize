package ui;

import Controller.Operations;

import java.util.Scanner;

public class ConsoleInterface {
    Operations operations;

    public ConsoleInterface(Operations operations) {
        this.operations = operations;
    }

    public void startMenu(){
        boolean run = true;
        while(run) {
            System.out.println("1. Вывести изображение на экран");
            System.out.println("2. Выбрать изображение");
            System.out.println("3. Выбрать цвет изображения");
            System.out.println("4. Выйти.");
            Scanner scanner = new Scanner(System.in);
            int result = scanner.nextInt();

            switch (result){
                case 1:
                    showPicture();
                    break;
                case 2:
                    choosePicture();
                    break;
                case 3:
                    choosePictureColor();
                    break;
                case 4:
                    saveData();
                    run = false;
                    break;
            }
        }
    }

    private void saveData() {
        operations.saveSettings();
    }

    public void choosePictureColor() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        for (String color :operations.getColorList()){
            System.out.printf("%d. %s\n", i++, color);
        }
        int result = scanner.nextInt();
        operations.changeColor(operations.getColorList().get(result-1));
    }

    public void choosePicture() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        for (String pic :operations.loadPicList()){
            System.out.printf("%d. %s\n", i++, pic);
        }
        int result = scanner.nextInt();
        operations.choosePicture(operations.loadPicList().get(result-1));
    }

    public void showPicture() {
        if (operations.pictureIsLoaded()){
            operations.showPicture();
        }
        else
            System.out.println("Необходимо выбрать картинку");
    }
}
