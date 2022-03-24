package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.util.ArrayList;

public abstract class Car extends Devices implements Sellable{
    Double fuelLevel;
    ArrayList owners = new ArrayList<>();

    public Car(String model, String producer, int yearOfProduction, Double value) {
        super(model,producer, value);
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    @Override
    public String turnOn() {return this.producer + "'s engine works!";}

    public int getYearOfProduction(){return this.yearOfProduction;}

    public void setYearOfProduction(){
        this.yearOfProduction = yearOfProduction;
    }

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

    public boolean wasPreviousOwner(Human owner){
        if(owners.contains(owner.firstName)){
            return true;
        }
        return false;
    }

    public String didSaleCar(Human seller, Human buyer){
        if(owners.contains(seller.firstName) && owners.contains(buyer.firstName)){
            int s = owners.indexOf(seller.firstName);
            int b = owners.indexOf(buyer.firstName);
            if (b - s == 1) {
                return "Yes, " + buyer.firstName + " bought car from " +seller.firstName;
            }
            return "No, " + buyer.firstName + " did not buy car from " +seller.firstName;
        }
        return seller.firstName + " and " + buyer.firstName + " did not have any transaction";
    }

    public String transactionCounter(){
        int transaction = owners.size();
        return "Car was sold "+ transaction +" times";
    }

    public void sell (Human seller, Human buyer, Double price)throws Exception {
        owners.add(seller.firstName);
        boolean name = true;
        if (buyer.cash < price) {
            throw new Exception("Sorry you do not have enough money");
        }
        if(!seller.hasACar(this)){
            throw new Exception("Sorry... There is nothing for sale");
        }
        if(!buyer.hasFreeParkingLot()){
            throw new Exception("Buyer hasn't got free parking lot");
        }if(owners.get(owners.size()- 1) != seller.firstName){
            throw new Exception("Car does not belongs to seller");
        }
        else{
            int size = owners.size();
            if(size >= 1){
                owners.remove((owners.size()- 1));
                owners.add(buyer.firstName);
            }
            buyer.addCar(this);
            seller.removeCar(this);
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Transaction complete");
            System.out.println("owners of car: " + owners);
            System.out.println(size + "rozmiar");
            System.out.println(size);
        }


    }
}