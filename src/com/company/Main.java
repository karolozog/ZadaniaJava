package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.FoodType;
import com.company.creatures.Pet;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet dog = new Pet("canis", "Szarik", FoodType.MEET);
        System.out.println("Pies nazywa się " + dog.name);
        System.out.println("Pies waży " + dog.getWeight());
        System.out.println(dog.species);
        dog.feed(0.1, FoodType.ALL, 12.1);
        System.out.println("Pies waży " + dog.getWeight());
        dog.feed(0.1, FoodType.ALL, 12.1);
        Pet cat = new Pet("fellis", "Rudy", FoodType.CROPS);
        System.out.println("Pies waży " + cat.getWeight());
        cat.feed(3.3, FoodType.CROPS, 2.1);
        System.out.println("Pies waży " + cat.getWeight());
        cat.getFoodType(2.1, FoodType.MEET, 1.0);
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        System.out.println("Pies waży " + dog.getWeight())

//        Car honda = new Diesel("Civic", "Honda", 1995, 500.0d);
//        Car hyundai = new Diesel("Pony", "Hyundai", 1992, 540.0d);
//        Car BMW = new Electric("f20", "BMW", 2012, 11000.0d);
//        Car Opel = new LPG("Vectra", "Opel", 1996, 560.0d);
//        Car Audi = new Diesel("a4", "Audi", 2001, 870.0d);
//
//        Human anna = new Human("anna","małecka", 600.3, 4);
//        anna.cash = 10000.0;
//
//        Human jacek = new Human("jacek", "placek", 1000.0, 2);
//        jacek.cash = 20000.0;
//
//        Human kamil = new Human("kamil", "kowalski", 20000.0, 3);
//
//        anna.addCar(hyundai);
//        anna.addCar(honda);
//        anna.addCar(BMW);
//        anna.addCar(Opel);
//
//        System.out.println("After transaction seller gots: " + jacek.cash);
//        System.out.println("After transaction seller gots: " + anna.cash);
//        System.out.println(anna.garage[0]);
//        System.out.println(anna.garage[1]);
//
//        System.out.println(anna.hasACar(honda));
//        System.out.println(anna.garage[0]);
//        System.out.println(anna.garage[1]);
//        System.out.println(jacek.garage[0]);
//
//        honda.sell(anna, jacek, 500.0d);
//        honda.sell( jacek,anna, 500.0d);
//        honda.sell(anna, jacek, 500.0d);
//        honda.sell( jacek,anna, 500.0d);
//        honda.sell(anna, jacek, 500.0d);
//
//        System.out.println(honda.didSaleCar(anna, kamil));
//        System.out.println(honda.transactionCounter());

//        Human seller = new Human("karol", "ozog", 300.0, 4);
//        seller.cash = 10.0;
//        seller.setCar(honda,  0);
//        seller.setCar(hyundai, 1);
//        System.out.println(seller.getCar(1));
//        System.out.println("value of garage is: " + seller.getValueOfGarage());

//        Application mario = new Application("mario", 10.0, 1.1); ;
//        Application tanks = new Application("tanks", 7.0, 2.1);
//        Application tic = new Application("tic", 3.1, 2.1);
//        Application contra = new Application("contra", 0.0, 8.0);
//        Phone nokia = new Phone("edge", "Nokia", 350.0, 25.0);
//        nokia.installApp(mario, 10.0);
//        nokia.installApp(tanks, 12.0);
//        nokia.installApp(tic, 1.0);
//        nokia.installApp(contra, 0.0);
//        System.out.println( nokia.isInstalled("mario"));
//        System.out.println(nokia.printFreeApps());
//        nokia.operationSystem = Phone.OpertionSystem.WINDOWS_MOBILE;





//        System.out.println(dog.getWeight());
//        dog.feed(20.0, Animal.FoodType.ALL, 5.0);
//        System.out.println(dog.getWeight());
//
//        System.out.println(Country.AUSTRIA.gpdInToPln());
//        System.out.println(Country.UK.language);
//        System.out.println(Country.AZEJBERDJAN.countryCode);
//        System.out.println(Country.BAHAMAS.gpdInToPln());
//
        Country[] countries = new Country[5];
        countries[0] = Country.UK;
        countries[1] = Country.AUSTRIA;
        countries[2] = Country.AZEJBERDJAN;
        countries[3] = Country.BAHAMAS;
        countries[4] = Country.BELGIUM;

//        Map<Country, Double> areaMap = new HashMap<>();
//        areaMap.put(Country.UK, 242.5);
//        areaMap.put(Country.AUSTRIA, 83.9);
//        areaMap.put( Country.AZEJBERDJAN, 86.6);
//        areaMap.put(Country.BAHAMAS, 13.9);
//        areaMap.put(Country.BELGIUM, 30.7);
//
//        System.out.println(areaMap.get(Country.BELGIUM));
//
//        Set<Map.Entry<Country, Double>> entrySet = areaMap.entrySet();
//        List<Map.Entry<Country, Double>> list = new ArrayList<>(entrySet);
//        Collections.sort(list, new Comparator<Map.Entry<Country, Double>>() {
//            @Override
//            public int compare(Map.Entry<Country, Double> o1, Map.Entry<Country, Double> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//
//        System.out.println("Map sorted from smallest to biggest country: ");
//
//        list.forEach(s->{
//            System.out.println(s.getValue()+ "\t" + s.getKey());
//        });


        Map<String, Country> capitalMap = new HashMap<>();
        capitalMap.put("London", Country.UK);
        capitalMap.put("Vienna", Country.AUSTRIA);
        capitalMap.put("Baku",  Country.AZEJBERDJAN);
        capitalMap.put("Nassan", Country.BAHAMAS);
        capitalMap.put("Brussels", Country.BELGIUM);

        Set<Map.Entry<String, Country>> capitalSet = capitalMap.entrySet();
        List<Map.Entry<String , Country>> capitalList = new ArrayList<>(capitalSet);
        Collections.sort(capitalList, new Comparator<Map.Entry<String, Country>>() {
            @Override
            public int compare(Map.Entry<String, Country> o1, Map.Entry<String , Country> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        System.out.println("Map sorted alphabetically by capital: ");

        capitalList.forEach(s->{
            System.out.println(s.getValue()+ "\t" + s.getKey());
        });


    Map<FoodType, List<Animal>> animalsByFood = new HashMap<>();
    List <Animal> omnivorous = new LinkedList<>();
    omnivorous.add(dog);
    omnivorous.add(new Pet("monkey", "Chikeetah", FoodType.CROPS));

    animalsByFood.put(FoodType.ALL, omnivorous);

    List<Animal> carnivorous = new LinkedList<>();
    carnivorous.add(cat);
    carnivorous.add(new FarmAnimal("wolf", "Baddy", FoodType.MEET));

    animalsByFood.put(FoodType.MEET, carnivorous);

    List<Animal> herbivores = new LinkedList<>();
    herbivores.add(new FarmAnimal("donkey", "Osioł", FoodType.CROPS));
    herbivores.add(new FarmAnimal("sheep", "suzie", FoodType.CROPS));

    animalsByFood.put(FoodType.CROPS, herbivores);
        System.out.println(animalsByFood);














    }
}




