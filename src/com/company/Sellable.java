package com.company;
import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.List;

public interface Sellable {
    List<Object> sellGoods = new ArrayList<>();
    List<Object>  boughtGoods = new ArrayList<>();


    void sell(Human seller, Human buyer, Double price)throws Exception;
}
