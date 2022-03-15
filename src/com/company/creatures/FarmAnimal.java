package com.company.creatures;


public class FarmAnimal extends Animal implements Edible{
    String colour;

    public FarmAnimal(String species, String name, String colour) {
        super(species, name);
        this.colour = colour;
    }


}
