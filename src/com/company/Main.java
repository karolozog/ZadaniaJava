package com.company;
import com.company.devices.*;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
     /*   Pet dog = new Pet("canis", "Szarik");
        System.out.println("Pies nazywa się " + dog.name);
        System.out.println("Pies waży " + dog.getWeight());
        System.out.println(dog.species);
        dog.feed();
        System.out.println("Pies waży " + dog.getWeight());
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        System.out.println("Pies waży " + dog.getWeight())

        FarmAnimal cow = new FarmAnimal("cow", "Jacky", "brown");
        cow.feed();


        Human karol  = new Human("Karol", "Ozog", 5.0d);
        System.out.println(karol.firstName);
        System.out.println(karol.lastName);

        System.out.println(karol.setSalary(600.0));

      */

        System.out.println(new Diesel("honda", "accent", 1999, 450.0).equals(new Diesel("honda", "accent", 1997, 450.0)));
        //System.out.println(honda.equals(hyundai));

        // Human karol  = new Human("Karol", "Ozog", 5.0d);
        Car honda = new Diesel("Civic", "Honda", 1995, 5000.0);
        Car hyundai = new LPG("Pony", "Hyundai", 1992, 5400.0);
        Car BMW = new Electric("f20", "BMW", 2012, 11000.0);

        Human seller = new Human("Karol", 3);
        seller.cash = 10.0;
        seller.setCar(honda, 0);
        seller.setCar(hyundai, 1);
        seller.setCar(BMW, 2);
        System.out.println("value of garage is: " + seller.getValueOfGarage());

        Human buyer = new Human( "Maciej", 5);
        buyer.cash = 20000.0;
        honda.sell(seller, buyer, 5000.0d );
        System.out.println("After transaction seller gots: " + seller.cash);

        Phone nokia = new Phone("edge", "Nokia", 350.0, 25.0);
        nokia.installApp("mario", 10.0);
        nokia.installApp("tanks", 12.0);
        nokia.installApp("tic", 1.0);







    }

}
