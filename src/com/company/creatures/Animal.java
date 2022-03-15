package com.company.creatures;
import com.company.Sellable;

public abstract class Animal implements Feedable,Sellable  {

    public String species;
    Double weight;
    public String name;
    private Boolean alive;


    public Animal(String species, String name) {
        this.alive = true;
        this.species = species;
        this.name = name;
    }

    public Double getWeight() {
        return this.weight;
    }

    public String toString(){
        return name + " " + species + " " + weight;
    }

    @Override
    public void feed() {
        this.weight += 0.5;
        System.out.println("dzięki za żarcie");
    }
    @Override
    public void takeForAWalk() {
        this.weight -= 0.5d;
        System.out.println("waga zwierzaka to " + this.weight);
        while (this.weight == 0.0d) {
            System.out.println("zabiłeś zwierzaka");
            break;
        }
    }


}

