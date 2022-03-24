package com.company.devices;

import java.util.ArrayList;
import java.util.List;

public class Phone extends Devices {
    static final String DEFAULT_DOWNLOAD_ADDRESS = "appstore.com/";
    static final String DEFAULT_PROTOCOL = "http://";
    public OpertionSystem operationSystem;

    public enum OpertionSystem {
        ANDROID, WINDOWS_MOBILE, iOS;
    }

    Double balance;
    boolean bluetooth;
    Double osVersion;
    Double screenSize;
    OpertionSystem opertionSystem;
    List installedAppsList = new ArrayList<>();
    List freeAppsList;

    @Override
    public String turnOn() {
        return this.producer + "Hello mate";
    }

    public Phone(String model, Double value, String producer, Double osVersion) {
        super(model, producer, value);
        this.osVersion = osVersion;
        freeAppsList = new ArrayList<Application>();
    }

    public Phone(String model, String producer, Double value, Double balance) {
        super(model, producer, value);
        this.balance = balance;
        freeAppsList = new ArrayList<Application>();
    }

    public void installApp(Application applicationToInstall, Double appPrice) {
        if (balance >= appPrice) {
            installedAppsList.add(applicationToInstall);
            balance -= appPrice;
            if (applicationToInstall.appPrice == 0.0d) {
                freeAppsList.add(applicationToInstall);
            }
            System.out.println(installedAppsList);
        } else {
            System.out.println("your balance is not enough to buy this app");
        }
        System.out.println("your balance is: " + balance);
    }

    public String isInstalledByName(Application app) {
        if (installedAppsList.contains(app.appName)) {
            return app.appName + " is already installed on your device";
        }
        return app.appName + " is not installed on your device";
    }

    public String isInstalled(Object app) {
        if (installedAppsList.contains(app)) {
            return app + " is already installed on your device";
        }
        return app + " is not installed on your device";
    }

    public String printFreeApps() {
        return "Free apps installed on your device: " + freeAppsList;
    }

//    public Double getValueOfApplication() {
//        Double sumValue = 0.0d;
//        int size = this.installedAppsList.size();
//        for (int j = 0; j < size; j++) {
//            sumValue += this.installedAppsList[j].appPrice;
//        }
//        return sumValue;
//    }

}