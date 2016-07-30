package com.company.AnimalFarm;

import com.company.Animals;

/**
 * Created by eyankiv on 29-Jul-16.
 */
public class Cat extends Animals {

    void growl(){
        System.out.println("Meow meow!!");
    }

    void makeSound(){
        growl();
    }
}
