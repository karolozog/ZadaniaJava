package com.company;
import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.Phone;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet dog = new Pet("canis", "Szarik", Animal.FoodType.MEET);
        System.out.println("Pies nazywa się " + dog.name);
        System.out.println("Pies waży " + dog.getWeight());
        System.out.println(dog.species);
        dog.feed();
        System.out.println("Pies waży " + dog.getWeight());

       /* dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        System.out.println("Pies waży " + dog.getWeight())

        FarmAnimal cow = new FarmAnimal("cow", "Jacky", "brown");
        cow.feed();
      */

        Car honda = new Diesel("Civic", "Honda", 1995, 5000.0);
        Car hyundai = new Diesel("Pony", "Hyundai", 1992, 5400.0);
        Car BMW = new Electric("f20", "BMW", 2012, 11000.0);

//        Human seller = new Human("Karol", 3);
//        seller.cash = 10.0;
//        seller.setCar(honda, 0);
//        seller.setCar(hyundai, 1);
//        seller.setCar(BMW, 2);
//        System.out.println("value of garage is: " + seller.getValueOfGarage());
//
//        Human buyer = new Human("Maciej", 5);
//        buyer.cash = 20000.0;
//        honda.sell(seller, buyer, 5000.0d);
//        System.out.println("After transaction seller gots: " + seller.cash);

        Human anna = new Human("anna", 5);
        anna.cash = 10000.0;
        anna.addCar(hyundai);



        System.out.println("After transaction seller gots: " + anna.cash);
        Human jacek = new Human("jacek", 1);
        jacek.cash = 20000.0;


        System.out.println("After transaction seller gots: " + jacek.cash);

        Phone nokia = new Phone("edge", "Nokia", 350.0, 25.0);
        nokia.installApp("mario", 10.0);
        nokia.installApp("tanks", 12.0);
        nokia.installApp("tic", 1.0);
//
//        Arrays.stream(seller.garage).sorted()
//            for (int i = 0; i < seller.garage.length;i++) {
//                System.out.print(seller.garage[i]);
//            }
//
//        }

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

        System.out.println();

        hyundai.sell(anna, jacek, 5000.0d);
        ArrayList owners = new ArrayList<>();
        System.out.println(owners);
        System.out.println(anna.garage.length);
        System.out.println(jacek.garage.length);
        hyundai.sell(jacek, anna,100.0 );
        jacek.getValueOfGarage();

    }
}




