package com.company.devices;
import java.util.ArrayList;
import java.util.List;
import static com.company.devices.Application.DEFAULT_APP_VERSION;

public class Phone extends Devices{

    static final String DEFAULT_DOWNLOAD_ADDRESS = "appstore.com/";
    static final String DEFAULT_PROTOCOL = "http://";
    public OpertionSystem operationSystem;
    public enum OpertionSystem{
        ANDROID, WINDOWS_MOBILE, iOS
    };
    List<Application> installedApps = new ArrayList<>();
    Double balance;
    boolean bluetooth;
    Double osVersion;
    Boolean installed = true;
    Double screenSize;
    OpertionSystem opertionSystem;

    @Override
    public String turnOn() { return this.producer + "Hello mate";}





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

 /*   public void installAnnApp(String appName, Double appVersion) {
        System.out.println(appName + " " + " is installed");
        installedApps.add((installApp.(appName););
    }*/

    public boolean isInstalled(List appName) {
        for (Application installedApps : this.installedApps) {
            if (installedApps == appName) {
                return true;
            }
        }
        return false;
    }
}


