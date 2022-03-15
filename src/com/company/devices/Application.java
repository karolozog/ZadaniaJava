package com.company.devices;

public class Application {
    public String appName;
    Double appVersion;
    public Double appPrice;
    public static final Double DEFAULT_APP_VERSION = 1.0;


    public Application(String appName, Double appPrice, Double appVersion) {
        this.appName = appName;
        this.appVersion = DEFAULT_APP_VERSION;
        this.appPrice = appPrice;
    }

    public String toString() { return appName + " " +appVersion  + " " + appPrice;}
}
