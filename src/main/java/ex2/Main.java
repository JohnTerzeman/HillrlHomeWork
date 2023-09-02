package ex2;

public class Main {
    public static void main(String[] args) {
        Storage<String, Integer> storage = new Storage<>();
        storage.put("one", 1);
        storage.put("two", 2);
        storage.put("three", 3);
        System.out.println(storage.get("one"));
        System.out.println(storage.containsKey("two"));
        System.out.println(storage.get("three"));
        System.out.println(storage.containsKey("four"));
        storage.remove("two");
        storage.clear();

    }
}