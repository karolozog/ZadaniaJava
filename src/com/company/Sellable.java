package com.company;

import java.util.ArrayList;
import java.util.List;

public interface Sellable {
    List<Object> sellGoods = new ArrayList<>();
    List<Object>  boughtGoods = new ArrayList<>();


    public default void sell(Human seller, Human buyer, Double price) throws Exception {

    }
}
