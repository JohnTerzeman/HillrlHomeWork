package zad19alishev40;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            int[] arr = new int[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(arr[2]);
        }
    }
}
