package zad19alishev39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerExeption {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new ScannerExeption("Пользователь ввел что-то кроме нуля");
            }
        }
    }
}
