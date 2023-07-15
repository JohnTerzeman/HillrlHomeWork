package zad7;


public class Main {
    public static void main(String[] args) {
        try {
            int dividend = 10;
            int divisor = 0;
            if (divisor == 0) {
                throw new ArithmeticException("Деление на ноль");
            }
            int result = dividend / divisor;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class MyException extends Exception {
    private String name;

    public MyException(String message) {
        this.name = message;
    }

    @Override
    public String getMessage() {
        return this.name;
    }
}