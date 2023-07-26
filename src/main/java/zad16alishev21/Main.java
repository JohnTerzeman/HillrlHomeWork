package zad16alishev21;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        Human h2 = new Human("Bob", 40);
        Human h3 = new Human("Rob", 40);
        h1.printNouberOfPeople();
        h2.printNouberOfPeople();
        h3.printNouberOfPeople();
    }
}

class Human {
    private String name;
    private int age;
    private static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNouberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }
}

