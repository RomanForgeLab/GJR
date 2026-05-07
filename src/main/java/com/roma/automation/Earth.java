package com.roma.automation;

public class Earth {
    private String name = "Earth";
    private String position = "third to the SUN";
    private String age = "4.54 billion years old";
    private String size = "12 756 km in diameter";
    private String temperature = "ranges from -89'C to over +50'C";

    public void printInfo() {
        System.out.println("Planet " + name + " is " + position + " and is " + age + " and its our homeworld =)");
        System.out.println("It is " + size + " and it's temperature " + temperature);
    }
}
