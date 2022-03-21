package com.company.devices;

public class Diesel extends Car {
    public Diesel(String model, String producer, int yearOfProduction, Double value) {
        super(model, producer, yearOfProduction, value);
    }


    @Override
    void refuel() {
        System.out.println("Car is refueled");
    }

    @Override
    public String turnOn() {
        return this.producer + " engine is working";
    }
}
