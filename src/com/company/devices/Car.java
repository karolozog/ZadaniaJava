package com.company.devices;
import com.company.Human;
import com.company.Sellable;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Devices implements Sellable{
    Double fuelLevel;
    List<String> owners = new ArrayList<>();

    public Car(String model, String producer, int yearOfProduction, Double value) {
        super(model,producer,  value);
        this.fuelLevel = fuelLevel;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String turnOn() {return this.producer + "'s engine works!";}

    public int getYearOfProduction(){return this.yearOfProduction;}

    public Double getValue() {return value;}

    abstract void refuel();

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != getClass()) {
            return false;
        }
        Car honda = (Car) o;
        return producer == honda.producer &&
                model == honda.model &&
                value.equals(honda.value);
    }

    public void sell (Human seller, Human buyer, Double price)throws Exception {
        owners.add(seller.firstName);
        if (buyer.cash < price) {
            throw new Exception("Sorry you do not have enough money");
        }
        if(!seller.hasACar(this)){
            throw new Exception("Sorry... There is nothing for sale");
        }
        if(!buyer.hasFreeParkingLot()){
            throw new Exception("Buyer hasn't got free parking lot");
        }
        if((owners.get(owners.size()-1))== seller.firstName) {
            buyer.addCar(this);
            seller.removeCar(this);
            buyer.cash -= price;
            seller.cash += price;


        }

        owners.add(buyer.firstName );

        System.out.println("Transaction complete");
        System.out.println("Previous owners of car: " + owners);
    }
}