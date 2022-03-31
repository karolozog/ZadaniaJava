package com.company.creatures;

public enum FoodType {
    MEET(0.7),
    CROPS(0.3),
    ALL(0.5);

    final Double foodBodyRatio;
    private double weight;

    private FoodType(Double foodBodyRatio) {
        this.foodBodyRatio = foodBodyRatio;
    }

}
