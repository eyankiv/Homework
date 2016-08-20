package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = { new Dog(),new Cat(),new Duck(),new Animal()};

        for (Animal a: animals) {
            a.makeSound();
        }
        Dog buf = new Dog();
        buf.makeSound();

    }
}
