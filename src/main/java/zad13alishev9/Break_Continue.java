package zad13alishev9;

public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла");
        System.out.println("\n");
        for (int j = 0; j < 15; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println("это нечетное число" + j);
        }
    }
}
