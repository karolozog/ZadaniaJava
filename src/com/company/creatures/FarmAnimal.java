package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{
    String colour;
    Double price;

    public FarmAnimal(String species, String name, FoodType foodType) {
        super(species, name, foodType);
    }
}
