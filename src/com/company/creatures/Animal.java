package com.company.creatures;
import com.company.Human;
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

    @Override
    public void sell(Human seller, Human buyer, Double price)throws Exception {
        if(buyer.cash < price){
            throw new Exception("Sorry you can not buy it");
        }
        if(!seller.hasAnimal(this)){
            throw new Exception("Sorry there is nothing to sell");
        }
        else{
            buyer.addAnimal(this);
            seller.removeAnimal(this);
            buyer.cash -= price;
            seller.cash += price;

        }
    }
}

