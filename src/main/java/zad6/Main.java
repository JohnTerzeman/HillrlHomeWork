package zad6;

public class Main {
    public static void main(String[] args) {
        Exception();
    }

    public static void Exception() {
        try (Resource resource = new Resource()) {
            throw new Exception("Exception found in try block");
        } catch (Exception e) {
            throw new ArithmeticException("Exception found in catch block");
        }
    }
}

class Resource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new ArithmeticException("Exception found in try with resources");
    }
}