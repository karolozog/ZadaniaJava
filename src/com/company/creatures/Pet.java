package com.company.creatures;

public class Pet extends Animal implements Feedable {

    private static final Double DEAFULT_DOG_WEIGHT = 3.0;
    private static final Double DEAULT_CAT_WEIGHT = 2.0;
    private static final Double DEAFULT_ANIMAL_WEIGHT = 1.0;
    private static final Double DEAULT_COW_WEIGHT = 130.2;


//    public Pet(String species, String name,FoodType foodType) {
//        super(species, name, foodType);
//        if (species.equals("canis")) {
//            this.foodType = FoodType.ALL;
//            this.weight = DEAFULT_DOG_WEIGHT;
//        } else if (species.equals("fellis")) {
//            this.foodType = FoodType.MEET;
//            this.weight = DEAULT_CAT_WEIGHT;
//        } else if (species.equals("cow")) {
//            this.foodType = FoodType.CROPS;
//            this.weight = DEAULT_COW_WEIGHT;
//        } else {
//            this.foodType = FoodType.ALL;
//            this.weight = DEAFULT_ANIMAL_WEIGHT;
//        }
//    }
    public Pet(String species, String name,FoodType foodType) {
        super(species, name, foodType);
        if (species.equals("canis")) {
            this.foodType = FoodType.ALL;
            this.weight = DEAFULT_DOG_WEIGHT;
        } else if (species.equals("fellis")) {
//            while(foodType != FoodType.MEET){
//                System.out.println("Fellis wants meet!!");
//                break;
//            }
            this.foodType = FoodType.MEET;
            this.weight = DEAULT_CAT_WEIGHT;
        } else if (species.equals("cow")) {
            this.foodType = FoodType.CROPS;
            this.weight = DEAULT_COW_WEIGHT;
        } else {
            this.foodType = FoodType.ALL;
            this.weight = DEAFULT_ANIMAL_WEIGHT;
        }
    }


     /*  public Pet(String species, Double price) {
        super(species, price);
    }*/
}
