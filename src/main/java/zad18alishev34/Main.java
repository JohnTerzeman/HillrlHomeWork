package zad18alishev34;
import zad18alishev33.Animal;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ////////////Java 5////////////////
        List animals = new ArrayList();
        Animal ourAnimals = new Animal();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");
        animals.add(ourAnimals);
        String animal = (String) animals.get(1);
        System.out.println(animal);

        ///////////С дженериками//////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Frog");
        String animal2 = animals2.get(1);

        //////////Java 7 //////////////
        List<String> animals3 = new ArrayList<>();
    }
}

