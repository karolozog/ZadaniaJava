package com.company.devices;

public abstract class Devices {
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
}

