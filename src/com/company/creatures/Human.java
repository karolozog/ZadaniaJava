package com.company.creatures;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Devices;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class Human  {
    private static final int DEFAULT_GARAGE_SIZE = 2;
    private static final int DEFAULT_STABLE_SIZE = 10;
    private static final int DEFAULT_GOODSSIZE = 13;

    public String firstName;
    public String lastName;
    private Double salary;
    public Double cash;
    public Car[] garage;
    public Animal[] stable;
    public Devices[] goods;
    private Double previousSalary;
    public Integer garageSize;
    ArrayList animal = new ArrayList();

    public Human(String firstName, String lastName, Double salary, Double cash, Integer garageSize, Integer goodsSize, Integer stableSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.cash = cash;
        this.garage = new Car[garageSize];
        this.stable = new Animal[DEFAULT_STABLE_SIZE];
        this.goods = new Devices[DEFAULT_GOODSSIZE];
    }

    public Double getSalary() {
        Date today = new Date();
        previousSalary = salary;
        System.out.println(this.firstName+"'s salary was checked on " + today.toString());
        System.out.println("Balance: ");
        return salary;
    }

    public Double setSalary(Double salary) {
        if (salary <= 0.00d){
            System.out.println("Please enter correct salary");
            return getSalary();
        }
        else if (salary >= 0.0d) {
            System.out.println("Accounting system updated");
            System.out.println("Collect documents form HR Assistant Hania");
            System.out.println("Do not hide your incomes. Revenue knows about everything.");
        }
        System.out.println(this.firstName+"'s last salary is: " +salary);
        System.out.println(this.firstName+"'s balance is:");
        return previousSalary + salary;
    }

    public String toString() {
        return firstName + " " + lastName + " " + salary;
    }

    public void canBuyCar(Car carWeLookingFor){
        if(this.salary > carWeLookingFor.getValue() ){
            System.out.println("you can buy this vehicle!");
        }else if(this.salary > carWeLookingFor.getValue()/12){
            System.out.println("you can buy vehicle with credit");
        }else {
            System.out.println("You can't afford it. become 15k programmer or ask for promotion");
        }
    }

    public void setCar(Car newCar, Integer parkingLotNumber) {
        this.garage[parkingLotNumber] = newCar;
    }

    public Car getCar(Integer parkingLotNumber) {
        return this.garage[parkingLotNumber];
    }

    public Double getValueOfGarage() {
        Double sumValue = 0.0d;
        for (Car car : this.garage) {
            if (car.value == null) {
                return car.value = 0.0d;
            }
            return sumValue += car.value;
        }
        return sumValue;
    }

//    public Double getValueOfGarage() {
//        Double sumValue = 0.0d;
//        for (Car car : this.garage){
//            sumValue += car.value;
//        }
//        return sumValue;
//    }

    public boolean hasACar(Car carWeLookingFor)throws Exception{
        for (int i = 0; i < garage.length; i++){
            if(this.garage[i] == carWeLookingFor){
                return true;
            }

        }
        throw new Exception("there is no such car in garage");
    }

    public boolean hasFreeParkingLot()throws Exception{
        for(int i = 0; i < this.garage.length;i++){
            if(this.garage[i] == null);
            return true;
        }throw new Exception("There is no space in garage");
    }

    public void addCar(Car newCar) {
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == null){
                garage[i] = newCar;
                break;
            }
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


    public Animal getAnimal(Integer stableLotNumber){ return this.stable[stableLotNumber];}

    public  void setAnimal(Animal newAnimal, Integer stableLotNumber) {
        this.stable[stableLotNumber] = newAnimal;}

    public boolean hasAnimal(Animal animalWeLookingFor) {
        for (Animal animal : this.stable){
            if(animal == animalWeLookingFor) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpaceForAnimal()throws  Exception{
        for(int i = 0; i < this.stable.length;i++){
            if(this.stable[i] == null);
            return true;
        }throw new Exception("There is no space in your stable");
    }

    public void addAnimal(Animal newAnimal) {
        for(int i = 0; i < stable.length; i++){
            if(stable[i] == null){
                stable[i] = newAnimal;
                break;
            }
        }
    }

    public void removeAnimal(Animal oldAnimal) {
        for(int i = 0; i < stable.length;i++) {
            if(stable[i] == oldAnimal){
                stable[i] = null;
                break;
            }
        }
    }

    public boolean hasDevice(Devices deviceWeLookingFor) {
        for (Devices device : this.goods){
            if(device == deviceWeLookingFor){
                return  true;
            }
        }
        return false;
    }

    public boolean hasSpaceForDevice()throws  Exception{
        for(int i = 0; i < this.goods.length;i++){
            if(this.goods[i] == null);
            return true;
        }throw new Exception("There is no space ito keep more stuff");
    }

    public void addDevice(Devices newDevice) {
        for(int i = 0; i < goods.length; i++){
            if(goods[i] == null){
                goods[i] = newDevice;
                break;
            }
        }
    }

    public void removeDevice(Devices oldDevice) {
        for(int i = 0; i < goods.length;i++) {
            if(goods[i] == oldDevice){
                goods[i] = null;
                break;
            }
        }
    }

}
