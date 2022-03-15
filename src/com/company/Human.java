package com.company;

import com.company.devices.Car;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Human {

    private static final int DEFAULT_GARAGE_SIZE = 2;
    public String firstName;
    public String lastName;
    private Double salary;
    Car[] garage;
    private LocalDate previousCheck;
    private Double previousSalary;
    public Double cash;

//    public Human(String firstName, String lastName, Double salary){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.salary = salary;
//        this.garage = new Car[DEFAULT_GARAGE_SIZE];
//    }

    public Human(String firstName, Integer garageSize) {
        this.firstName = firstName;
        this.garage = new Car[garageSize];
    }

    public Double getSalary() {
        if (previousCheck != null) {
            long diff = ChronoUnit.SECONDS.between(previousCheck, LocalDate.now());
            System.out.printf("Your salary was checked %d s ago, you balance was %f", diff, previousSalary);
        }
        previousCheck = LocalDate.now();
        previousSalary = salary;
        return salary;
    }

    public Double setSalary(Double salary) {
        if (salary >= 0.0d) {
            System.out.println("Accounting system updated");
            System.out.println("Collect documents form Hania");
            System.out.println("Do not hide your incomes. Ravenue knows.");
        }
        return salary;
    }

           /* if(salary > newCar.getValue() ){
            System.out.println("you can buy this newCar!");
            this.newCar = newCar;
        }else if(salary > newCar.getValue()/12){
            System.out.println("you can buy newCar with credit");
            this.newCar = newCar;
        }else {
            System.out.println("You can't afford it. become 10k programmer or ask for promotion");
        }*/

    public String toString() {
        return firstName + " " + lastName + " " + salary;
    }

    public void setCar(Car newCar, Integer parkingLotNumber) {
        this.garage[parkingLotNumber] = newCar;
    }

    public Car getCar(Integer parkingLotNumber) {
        return this.garage[parkingLotNumber];
    }

    public Double getValueOfGarage() {
        Double sumValue = 0.0;
        for (int i = 0; i < this.garage.length; i++) {
            sumValue += this.garage[i].value;
        }
        return sumValue;
    }

    public boolean hasACar(Car carWeLookingFor){
        for (Car car : this.garage){
            if(car == carWeLookingFor){
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeParkingLot(){
        for(int i = 0; i < this.garage.length;i++){
            if(this.garage[i] == null);
            return true;
        }
        return false;
    }

    public void addCar(Car newCar) throws Exception {
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == null){
                garage[i] = newCar;
                break;
            }
            throw new Exception("there is no free space in garage");
        }
    }

    public void removeCar(Car oldCar){
        for(int i = 0; i < garage.length;i++) {
            if(garage[i] == oldCar){
                garage[i] = null;
                break;
            }
        }
    }
}