package com.company.devices;
import com.company.Sellable;
import com.company.Human;

public abstract class Devices implements Sellable {
    final String model;
    final String producer;
    int yearOfProduction;
    public Double value;

    public Devices(String model,String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.value = value;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    public abstract void turnOn();

    @Override
    public void sell(Human seller, Human buyer, Double price)throws Exception {
        if(buyer.cash < price){
            throw new Exception("Sorry you can not buy it");
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

