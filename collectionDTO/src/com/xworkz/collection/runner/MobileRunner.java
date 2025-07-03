package com.xworkz.collection.runner;

import com.xworkz.collection.dto.MobileDTO;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class MobileRunner {

    public static void main(String[] args) {
        Collection<MobileDTO> mobiles = new HashSet<>();

        mobiles.add(new MobileDTO("Samsung", "Galaxy S23", 69999.99, 8, 128, "Snapdragon 8 Gen 2", "Black", "Android", 4500, 2023));
        mobiles.add(new MobileDTO("Apple", "iPhone 14", 79999.00, 6, 128, "A15 Bionic", "Blue", "iOS", 3279, 2022));
        mobiles.add(new MobileDTO("OnePlus", "11R", 43999.00, 8, 256, "Snapdragon 8+ Gen 1", "Green", "Android", 5000, 2023));
        mobiles.add(new MobileDTO("Vivo", "X90", 59999.00, 12, 256, "Dimensity 9200", "Red", "Android", 4810, 2023));
        mobiles.add(new MobileDTO("Realme", "GT Neo 3", 32999.00, 8, 128, "Dimensity 8100", "Black", "Android", 5000, 2022));
        mobiles.add(new MobileDTO("Xiaomi", "Mi 11X", 27999.00, 6, 128, "Snapdragon 870", "White", "Android", 4520, 2021));
        mobiles.add(new MobileDTO("Motorola", "Edge 40", 29999.00, 8, 128, "Dimensity 8020", "Blue", "Android", 4400, 2023));
        mobiles.add(new MobileDTO("Google", "Pixel 7a", 43999.00, 8, 128, "Google Tensor G2", "Sea", "Android", 4385, 2023));
        mobiles.add(new MobileDTO("iQOO", "Neo 7", 31999.00, 12, 256, "Dimensity 8200", "Blue", "Android", 5000, 2023));
        mobiles.add(new MobileDTO("Nothing", "Phone 1", 34999.00, 8, 128, "Snapdragon 778G+", "Black", "Android", 4500, 2022));


        System.out.println("Mobile Names:");
        Iterator<MobileDTO> iterator1 = mobiles.iterator();
        while (iterator1.hasNext()) {
            MobileDTO mobile = iterator1.next();
            System.out.println(mobile.getBrand() + " " + mobile.getModel());
        }

        System.out.println("\nFull Mobile Details:");
        Iterator<MobileDTO> iterator2 = mobiles.iterator();
        while (iterator2.hasNext()) {
            MobileDTO mobile = iterator2.next();
            System.out.println("Brand      : " + mobile.getBrand());
            System.out.println("Model      : " + mobile.getModel());
            System.out.println("Price      : ₹" + mobile.getPrice());
            System.out.println("RAM        : " + mobile.getRam() + "GB");
            System.out.println("Storage    : " + mobile.getStorage() + "GB");
            System.out.println("Processor  : " + mobile.getProcessor());
            System.out.println("Color      : " + mobile.getColor());
            System.out.println("OS         : " + mobile.getOs());
            System.out.println("Battery    : " + mobile.getBattery() + "mAh");
            System.out.println("Year       : " + mobile.getReleaseYear());
            System.out.println("-------------------------------------");
        }
    }
}
