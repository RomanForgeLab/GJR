package com.roma.automation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class Planets {
    public static void main(String[] args) {
        String star = "Sun";
        System.out.println("Welcome to the Solar System with the star called " + star + ". Here you can see our planets: ");


        List<String> planets = new ArrayList<>(List.of("Mercury", "Venus", "Earth", "Jupitor", "Saturn", "Uranus", "Neptune"));
        for (var planet : planets) {
            System.out.print(planet + " ");
        }
        System.out.println();
        System.out.println("Lets start our journey: ");


        Sun s = new Sun();
        s.print();

        Mercury p1 = new Mercury();
        p1.printInfo();

        Earth p2 = new Earth();
        p2.printInfo();

    }
}