package com.xworkz.collection.runner;

import com.xworkz.collection.dto.BileDTO;

import java.util.ArrayList;
import java.util.Collection;

public class BikeRunner {
    public static void main(String[] args) {
        Collection<BileDTO> bike = new ArrayList<>();
        bike.add(new BileDTO("Himalayan", "Royal Enfield", "White", "Adventure", "450CC", "KA14EN7845", "Skanda"));
        bike.add(new BileDTO("Duke 390", "KTM", "Orange", "Sports", "390CC", "KA01AB1234", "Ravi"));
        bike.add(new BileDTO("Classic 350", "Royal Enfield", "Black", "Cruiser", "350CC", "KA02CD5678", "Manoj"));
        bike.add(new BileDTO("Pulsar NS200", "Bajaj", "Blue", "Naked", "200CC", "KA03EF9012", "Kiran"));
        bike.add(new BileDTO("Apache RTR 160", "TVS", "Red", "Street", "160CC", "KA04GH3456", "Deepak"));
        bike.add(new BileDTO("FZ-S", "Yamaha", "Matte Green", "Street", "150CC", "KA05IJ7890", "Suresh"));
        bike.add(new BileDTO("Gixxer", "Suzuki", "Grey", "Naked", "155CC", "KA06KL1122", "Ramesh"));
        bike.add(new BileDTO("CBR 250R", "Honda", "Repsol", "Sports", "250CC", "KA07MN3344", "Arjun"));
        bike.add(new BileDTO("Interceptor 650", "Royal Enfield", "Silver", "Cruiser", "650CC", "KA08OP5566", "Varun"));
        bike.add(new BileDTO("MT-15", "Yamaha", "Black", "Naked", "155CC", "KA09QR7788", "Prashanth"));
        System.out.println("Bike Details:");
        for(BileDTO bileDTO : bike) {
            System.out.println("Differnt Type Of Bike Names:" +bileDTO.getName());
            System.out.println("");
            System.out.println("Brand Name: "+bileDTO.getBrand());
            System.out.println("");
            System.out.println("Bike Color: "+bileDTO.getColor());
            System.out.println("");
            System.out.println("Bike Type: "+bileDTO.getType());
            System.out.println("");
            System.out.println("Bike Capacity: "+bileDTO.getCapacity());
            System.out.println("");
            System.out.println("Bike Number: "+bileDTO.getNumber());
            System.out.println("");
            System.out.println("Bike Owner: "+bileDTO.getOwner());
        }


    }
}
