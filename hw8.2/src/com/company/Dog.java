package com.company;

/**
 * Created by eyankiv on 01-Aug-16.
 */
public class Dog extends Animal{
    String name;
    void bark(){
        System.out.println("haf haf!!");
    }

    @Override
    void makeSound() {
        bark();
    }
}
