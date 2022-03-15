package com.company.creatures;

public class Pet extends Animal implements Feedable {

    private static final Double DEAFULT_DOG_WEIGHT = 3.0;
    private static final Double DEAULT_CAT_WEIGHT = 2.0;
    private static final Double DEAFULT_ANIMAL_WEIGHT = 1.0;

    public Pet(String species, String name) {
        super(species, name);
        if (species.equals("canis")) {
            this.weight = DEAFULT_DOG_WEIGHT;
        } else if (species.equals("fellis")) {
            this.weight = DEAULT_CAT_WEIGHT;
        } else {
            this.weight = DEAFULT_ANIMAL_WEIGHT;
        }
    }

}
