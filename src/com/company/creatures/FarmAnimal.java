package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{
    String colour;

    public FarmAnimal(String species, String name, String colour,FoodType foodType) {
        super(species, name, foodType);
        this.colour = colour;
    }



}
