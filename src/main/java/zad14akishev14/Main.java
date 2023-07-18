package zad14akishev14;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Sam";
        person1.age = 40;
        System.out.println("My name is " + person1.name + ", " + "I`m " + person1.age + "years old");
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 34;
        System.out.println("My name is " + person2.name + ", " + "I`m " + person2.age + "years old");
    }
}
class Person {
    String name;
    int age;
}


