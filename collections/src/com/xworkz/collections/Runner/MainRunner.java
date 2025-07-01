package com.xworkz.collections.Runner;

import java.util.*;

public class MainRunner {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("KTM");
        arrayList.add("MT15");
        arrayList.add("Classic");
        arrayList.add("Splendor");
        arrayList.add("DIO");
        arrayList.add("Activa");
        arrayList.add("Pulsar");
        arrayList.add("XL Supper");
        arrayList.add("Access 125");
        arrayList.add("Jupitar");
        System.out.println("Number Of Bikes: "+arrayList.size());
        arrayList.clear();
        System.out.println("Result After The Clear...");
        System.out.println("Number of Bikes: "+arrayList.size());
        arrayList.add("KTM");
        arrayList.add("MT15");
        arrayList.add("Classic");
        arrayList.add("Jupitar");
        arrayList.add("DIO");
        arrayList.add("Activa");
        arrayList.add("Pulsar");
        arrayList.add("Splendor");
        arrayList.add("XL Supper");
        arrayList.add("Access 125");
        System.out.println("Result After Add..");
        System.out.println("Number Of Bikes: "+arrayList.size());

        System.out.println("Car Details..");
        Set<String> car = new TreeSet<>();
        car.add("Waganor");
        car.add("Shift");
        car.add("omini");
        car.add("Ignes");
        car.add("Grand Vitara");
        car.add("XL6");
        car.add("Eritigo");
        car.add("Franz");
        car.add("Balenooo");
        car.add("XpressOO");
        System.out.println("Number Of Cars: "+car.size());
        car.clear();
        System.out.println("After The Clear."+car.size());
        car.add("Waganor");
        car.add("Shift");
        car.add("omini");
        car.add("Ignes");
        car.add("Grand Vitara");
        car.add("XL6");
        car.add("Eritigo");
        car.add("Franz");
        car.add("Balenooo");
        car.add("XpressOO");

        System.out.println("Then After ADD: "+car.size());






    }
}
