package zad14akishev15;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Sam";
        person1.age = 40;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 34;
        person2.speak();
        person2.sayHello();

    }
}
class Person {
    String name;
    int age;
    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", " + "I`m " + age + "years old");
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
