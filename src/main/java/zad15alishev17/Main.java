package zad15alishev17;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Sam" , 40);
        String s1 = "Bob";
        Person person2 = new Person();
        person2.setNameAndAge(s1 , 30);
        person1.speak();
        person2.speak();

    }
}
class Person {
    String name;
    int age;

    void setNameAndAge(String username , int userage){
        name = username;
        age = userage;
    }

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

