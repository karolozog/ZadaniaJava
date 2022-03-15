package com.company.devices;

public class LPG extends Car{
    public LPG(String model, String producer, int yearOfProduction, Double value) {
        super(model, producer, yearOfProduction, value);
    }

    @Override
    void refuel() {
        System.out.println("Car is refueled");
    }
}
