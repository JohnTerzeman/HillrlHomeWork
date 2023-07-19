package zad13alishev10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите возраст");
        String age = scanner.nextLine();
        switch (age) {
            case "ноль":
                System.out.println("Ты родился");
                break;
            case "семь":
                System.out.println("Ты пошел в школу");
                break;
            case "восемнадцать":
                System.out.println("Ты окончил школу");
                break;
            default:
                System.out.println("ни одно из предыдущих условиях не подошло");
        }
    }
}
