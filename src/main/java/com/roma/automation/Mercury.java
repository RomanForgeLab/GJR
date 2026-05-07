package com.roma.automation;

public class Mercury {

    private  String planet = "Mercury";
    private  String size = "4,879 km in diameter";
    private  String temperature = "ranges from -180'C to + 430'C";
    private  String position = "closest to the star SUN";

    public  void printInfo() {
        System.out.println("Planet " + planet + " is " + position + ". It's size is " + size + " and temperature " + temperature);

    }
}
