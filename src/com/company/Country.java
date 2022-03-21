package com.company;

public enum Country {
    UK("English", "UK", 5000.5),
    AUSTRIA("German", "AUS", 1552.5),
    AZEJBERDJAN("Russian", "AZ", 8525.85),
    BAHAMAS("English","BAH", 865324.7),
    BELGIUM("Flamand", "BEL", 868585.5);

    final String language;
    final String countryCode;
    public Double GDP;




    private Country(String language, String countryCode, Double GDP){
        this.language = language;
        this.countryCode = countryCode;
        this.GDP = GDP;


    }
    public Double gpdinToPln(){
        return this.GDP * 4.27;
    }
}
