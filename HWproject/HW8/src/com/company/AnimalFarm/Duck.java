package com.company.AnimalFarm;

import com.company.Animals;

/**
 * Created by eyankiv on 29-Jul-16.
 */
public class Duck extends Animals {

    void quack(){
        System.out.println("quak quak!");
    }

    void makeSound(){
        quack();
    }
}
