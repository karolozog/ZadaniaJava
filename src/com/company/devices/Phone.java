package com.company.devices;

import java.util.ArrayList;
import java.util.List;

import static com.company.devices.Application.DEFAULT_APP_VERSION;

public class Phone extends Devices {

    static final String DEFAULT_DOWNLOAD_ADDRESS = "appstore.com/";
    static final String DEFAULT_PROTOCOL = "http://";
    List<Application> installedApps = new ArrayList<>();
    Double balance;
    boolean bluetooth;
    Double osVersion;
    Boolean installed = true;

 /*   public Phone(String model, String producer, boolean bluetooth, int yearOfProduction, Double osVersion, Double value) {
        super(model, value);
        this.bluetooth = true;
        this.osVersion = osVersion;
        List<String> installedApps = new ArrayList<>();
    }*/

    public Phone(String model, String producer, Double value, Double balance) {
        super(model, producer, value);
        this.balance = balance;
    }

    public void turnOn() {
        System.out.println("Hello mate");
    }


    public void installApp(String appName, Double appPrice) {
        if (balance >= appPrice) {
            installedApps.add(new Application(appName, appPrice, DEFAULT_APP_VERSION));
            balance -= appPrice;
            System.out.println(installedApps);
            System.out.println("your balance is: " + balance);
        } else {
            System.out.println("your balance is not enough to buy this app");
            System.out.println("your balance is: " + balance);
        }
    }

    public void isInstalled(Object appName)throws Exception{
        if(installedApps.contains(appName)){
            throw new Exception(appName + " is installed on your device");
        } else throw new Exception(appName + " is not installed on your device");
    }

    public void installApp(Application tic) {
    }

   /*
    @Override
    public String toString() {
        return "Phone{" +
                "installedApps=" + installApps +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction;
    }
*/



}



