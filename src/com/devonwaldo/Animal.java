package com.devonwaldo;

public class Animal implements IAnimalTraits {
    // These are variables, otherwise known as properties
    String name;
    String type;

    public String getType() {
        return type;
    }




    public String getName() {
        return this.name;
    }

    public String getNameAndType() {
        return "I am a " + getName() + " and I am a " + getType();
    }

    // Here lies a constructor which creates a new instance of a class.
    public Animal(String name) {
        this.name = name;
        this.type = "Unknown";
    }

    public void setName(String name) {
        this.name = name;

        System.out.println("getType method returns " + getName() + "!");







    }

    @Override
    public void whatIEat() {

    }

    @Override
    public void whatISay() {

    }

    @Override
    public void returnToAnimalChoice() {

    }
}
