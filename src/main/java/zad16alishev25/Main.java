package zad16alishev25;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 40);
        System.out.printf(human1.toString());
    }
}

class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " , " + age;
    }
}