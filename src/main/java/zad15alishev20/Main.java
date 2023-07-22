package zad15alishev20;

import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args){
        Human human1 = new Human();

    }
}
class Human{
    private String name;
    private int age;
    public Human(){
        this.name = "Имя по умолчанию";
        this.age = 0;
    }
    public Human(String name){
        System.out.println("Привет из второго конструктора");

    }
    private Human(String name , int age){
        System.out.println("Привет из третего конструктора");
        this.name = name;
        this.age = age;
    }



}
