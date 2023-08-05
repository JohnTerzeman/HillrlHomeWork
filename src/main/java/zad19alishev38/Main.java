package zad19alishev38;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            readFile();

        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }

    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("gfd");
        Scanner scanner = new Scanner(file);
    }
}
