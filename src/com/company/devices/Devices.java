package com.company.devices;
import com.company.Sellable;
import com.company.creatures.Human;

public abstract class Devices implements Sellable {
    public String model;
    public String producer;
    public int yearOfProduction;
    public Double value;

    public Devices(String model, String producer, Double value, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    public abstract String turnOn();

    public void sell(Human seller, Human buyer, Double price)throws Exception {
        if(buyer.cash < price){
            throw new Exception("Sorry you do not have enough money");
        }
        if(!seller.hasDevice(this)){
            throw new Exception("Sorry there is nothing to sell");
        }
        else{
            buyer.addDevice(this);
            seller.removeDevice(this);
            buyer.cash -= price;
            seller.cash += price;

        }
    }
}

