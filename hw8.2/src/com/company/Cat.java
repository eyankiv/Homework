package com.company;

/**
 * Created by eyankiv on 01-Aug-16.
 */
public class Cat extends Animal {
    String name;
    void growl(){
        System.out.println("Meow Meow!!");
    }

    @Override
    void makeSound() {
        growl();
    }
}
