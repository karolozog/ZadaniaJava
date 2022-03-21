package com.company.creatures;
import com.company.Human;
import com.company.Sellable;

public abstract class Animal implements Feedable,Sellable {

    public enum FoodType {
        MEET(0.7),
        CROPS(0.3),
        ALL(0.5);

        final Double foodBodyRatio;

        private FoodType(Double foodBodyRatio) {
            this.foodBodyRatio = foodBodyRatio;
        }

    }

    public String species;
    Double weight;
    public String name;
    private Boolean alive;
    public final FoodType foodType;
    Double foodWeight;


    public Animal(String species, String name, FoodType foodType) {
        this.alive = true;
        this.species = species;
        this.name = name;
        this.foodType = foodType;
    }

    public Double getWeight() {
        return this.weight;
    }

    public String toString() {
        return name + " " + species + " " + weight;
    }

    //    @Override
//    public void feed() {
//        this.weight += 0.5;
//        System.out.println("dzięki za żarcie");
//    }
    @Override
    public void takeForAWalk() {
        this.weight -= 0.5d;
        System.out.println("waga zwierzaka to " + this.weight);
        while (this.weight == 0.0d) {
            System.out.println("zabiłeś zwierzaka");
            break;
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("Sorry you can not buy it");
        }
        if (!seller.hasAnimal(this)) {
            throw new Exception("Sorry there is nothing to sell");
        } else {
            buyer.addAnimal(this);
            seller.removeAnimal(this);
            buyer.cash -= price;
            seller.cash += price;
        }
    }

    public void getFoodType(Double foodWeight, FoodType foodType) {
        if (this.foodType != foodType)
            System.out.println("Ough! Disgusting, gimme other food");
        else {
            this.weight += foodType.foodBodyRatio * foodWeight;
            System.out.println("thx for food");
        }
    }

    public void feed(Double weight, FoodType foodType, Double foodWeight) {
        switch (foodType) {
            case ALL:
                this.weight += foodType.foodBodyRatio * foodWeight;
                break;
            case MEET:
                this.weight += foodType.foodBodyRatio * foodWeight;
                break;
            case CROPS:
                this.weight += foodType.foodBodyRatio * foodWeight;
                break;
        }
    }
}
