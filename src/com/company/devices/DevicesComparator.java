package com.company.devices;

import java.util.Comparator;

public class DevicesComparator implements Comparator <Devices> {
    @Override
    public int compare(Devices o1, Devices o2){
        return o1.producer.compareTo(o2.producer);
    }
}
