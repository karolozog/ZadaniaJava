package com.company;

import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;

public class Main {

    public static void main(String[] args) throws Exception {
//        Pet dog = new Pet("canis", "Szarik", Animal.FoodType.MEET);
//        System.out.println("Pies nazywa się " + dog.name);
//        System.out.println("Pies waży " + dog.getWeight());
//        System.out.println(dog.species);
//        dog.feed();
//        System.out.println("Pies waży " + dog.getWeight());
//
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        System.out.println("Pies waży " + dog.getWeight())

        Car honda = new Diesel("Civic", "Honda", 1995, 500.0d);
        Car hyundai = new Diesel("Pony", "Hyundai", 1992, 540.0d);
        Car BMW = new Electric("f20", "BMW", 2012, 11000.0d);
        Car Opel = new LPG("Vectra", "Opel", 1996, 560.0d);
        Car Audi = new Diesel("a4", "Audi", 2001, 870.0d);

        Human anna = new Human("anna","małecka", 600.3, 4);
        anna.cash = 10000.0;

        Human jacek = new Human("jacek", "placek", 1000.0, 2);
        jacek.cash = 20000.0;

        Human kamil = new Human("kamil", "kowalski", 20000.0, 3);

        anna.addCar(hyundai);
        anna.addCar(honda);
        anna.addCar(BMW);
        anna.addCar(Opel);


//
//        System.out.println("After transaction seller gots: " + jacek.cash);
//        System.out.println("After transaction seller gots: " + anna.cash);
        System.out.println(anna.garage[0]);
        System.out.println(anna.garage[1]);

        System.out.println(anna.hasACar(honda));
        System.out.println(anna.garage[0]);
        System.out.println(anna.garage[1]);
        System.out.println(jacek.garage[0]);

        honda.sell(anna, jacek, 500.0d);
        honda.sell( jacek,anna, 500.0d);
        honda.sell(anna, jacek, 500.0d);
        honda.sell( jacek,anna, 500.0d);
        honda.sell(anna, jacek, 500.0d);

        System.out.println(honda.didSaleCar(anna, kamil));
        System.out.println(honda.transactionCounter());

//        System.out.println(anna.garage[0]);
//        System.out.println(anna.garage[1]);
//        System.out.println(jacek.garage[0]);
//        System.out.println(jacek.garage[1]);
//        System.out.println(anna.cash);
//        System.out.println(jacek.cash);
//        hyundai.sell(anna, jacek, 500.0d);
//        System.out.println(anna.garage[0]);
//        System.out.println(anna.garage[1]);
//        System.out.println(jacek.garage[0]);
//        System.out.println(jacek.garage[1]);
//        System.out.println(anna.cash);
//        System.out.println(jacek.cash);
//        hy



//        Human seller = new Human("karol", "ozog", 300.0, 4);
//        seller.cash = 10.0;
//        seller.setCar(honda,  0);
//        seller.setCar(hyundai, 1);
//        System.out.println(seller.getCar(1));
//        System.out.println("value of garage is: " + seller.getValueOfGarage());

//        Phone nokia = new Phone("edge", "Nokia", 350.0, 25.0);
//        nokia.installApp("mario", 10.0);
//        nokia.installApp("tanks", 12.0);
//        nokia.installApp("tic", 1.0);
//


//        nokia.installApp("Mario", 1.0);
//        nokia.installApp("Mario", 1.0);
//        nokia.operationSystem = Phone.OpertionSystem.ANDROID;
//        System.out.println(dog.getWeight());
//        dog.feed(20.0, Animal.FoodType.ALL, 5.0);
//        System.out.println(dog.getWeight());
//
//        System.out.println(Country.AUSTRIA.gpdinToPln());
//        System.out.println((Country.UK.gpdinToPln()));
//        System.out.println(Country.AZEJBERDJAN.gpdinToPln());
//        System.out.println(Country.BAHAMAS.gpdinToPln());
//
//        Country[] countries = new Country[5];
//        countries[0] = Country.UK;
//        countries[1] = Country.AUSTRIA;
//        countries[2] = Country.AZEJBERDJAN;
//        countries[3] = Country.BAHAMAS;
//        countries[4] = Country.BELGIUM;














    }
}




