package com.company;

/**
 * Created by eyankiv on 01-Aug-16.
 */
public class Duck extends Animal {
    String name;
    void quak(){
        System.out.println("quak quak");
    }

    @Override
    void makeSound() {
        quak();
    }
}
