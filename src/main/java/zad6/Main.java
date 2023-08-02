package zad6;

public class Main {
    public static void main(String[] args) {
        Exception();
    }

    public static void Exception() {
        try (Resource resource = new Resource()) {
            throw new Exception("Исключение в блоке try");
        } catch (Exception e) {
            throw new ArithmeticException("Исключение в блоке catch");
        }
    }
}

class Resource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new ArithmeticException("Исключение в блоке try с ресурсами");
    }
}