package com.devonwaldo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    List<Animal> animalList = new ArrayList<>();

    // Animal types
    // Insects
    // Birds
    // Fish
    // Mammals
    // Reptiles


    // Create all the animals in the zoo and store them in the
    // list animalList

    public void fillAnimals() {
        fillInsects();
        fillBirds();
        fillFish();
        fillMammals();
        fillReptiles();

    }

    public void showInventory() {
        System.out.println("Zoo Inventory");
        for (Animal animal : animalList) {
            System.out.println(animal.getNameAndType());
        }
        System.out.println("Zoo has " + animalList.size() + " animals");
    }


    private void fillInsects() {
        Insect bee = new Insect("Bee");
        animalList.add(bee);

        Insect fly = new Insect("Fly");
        animalList.add(fly);
    }

    private void fillBirds() {
        Bird cardinal = new Bird("Cardinal");
        animalList.add(cardinal);

        Bird crow = new Bird("Crow");
        animalList.add(crow);

    }

    private void fillFish() {
        Fish shark = new Fish("Shark");
        animalList.add(shark);

        Fish goldfish = new Fish("Goldfish");
        animalList.add(goldfish);

    }

    private void fillMammals() {
        Mammal rabbit = new Mammal("Rabbit");
        animalList.add(rabbit);

        Mammal squirrel = new Mammal("Squirrel");
        animalList.add(squirrel);

    }

    private void fillReptiles() {
        Reptile snake = new Reptile("Snake");
        animalList.add(snake);

        Reptile lizard = new Reptile("Lizard");
        animalList.add(lizard);

    }

}






