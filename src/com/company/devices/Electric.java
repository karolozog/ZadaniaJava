package com.company.devices;

public class Electric extends Car{
    public Electric(String model, String producer, int yearOfProduction, Double value) {
        super(model, producer, yearOfProduction, value);
    }

    @Override
    void refuel() {
        System.out.println("Car is charged");
    }
}
