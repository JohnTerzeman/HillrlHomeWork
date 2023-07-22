package zad15alishev16;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Sam";
        person1.age = 40;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 34;
        int year1 = person1.calculeteYears();
        int year2 = person2.calculeteYears();
        System.out.println("Первому человеку до пенсии" + year1 + "лет");
        System.out.println("Второму человеку до пенсии" + year2 + "лет");
    }
}

class Person {
    String name;
    int age;

    int calculeteYears() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", " + "I`m " + age + "years old");
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }
}
