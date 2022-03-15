package com.company.creatures;

public interface Feedable{

    public default void feed() {

        System.out.println("yummy");
    }


    public default void takeForAWalk() {
        System.out.println("run run run");
    }
}
