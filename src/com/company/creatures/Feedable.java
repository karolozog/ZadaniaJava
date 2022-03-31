package com.company.creatures;

public interface Feedable{


    public default void takeForAWalk() {
        System.out.println("run run run");
    }
}
