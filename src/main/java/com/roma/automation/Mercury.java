package com.roma.automation;

public class Mercury {

    private static String planet = "Mercury";
    private static String size = "4,879 km in diameter";
    private static String temperature = "ranges from -180'C to + 430'C";
    private static String position = "closest to the star SUN";

    public static void printInfo() {
        System.out.println("Planet " + planet + " is " + position + ". It's size is " + size + " and temperature " + temperature);

    }
}
