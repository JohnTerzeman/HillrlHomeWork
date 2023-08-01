package zad18alishev35;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());

        terst(listOfAnimals);
        terst(listOfDogs);


    }

    private static void terst(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }
}

