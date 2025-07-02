package com.xworkz.collection.runner;

import com.xworkz.collection.dto.CarDTO;

import java.util.ArrayList;
import java.util.Collection;

public class CarRunner {
    public static void main(String[] args) {
        Collection<CarDTO> cars = new ArrayList<>();

        cars.add(new CarDTO("Thar", "Mahindra", "Black", "SUV", "2184CC", "KA01AB1234", "Skanda"));
        cars.add(new CarDTO("Innova Crysta", "Toyota", "White", "MPV", "2393CC", "KA02CD5678", "Manoj"));
        cars.add(new CarDTO("Creta", "Hyundai", "Red", "SUV", "1497CC", "KA03EF9012", "Kiran"));
        cars.add(new CarDTO("City", "Honda", "Silver", "Sedan", "1498CC", "KA04GH3456", "Deepak"));
        cars.add(new CarDTO("Swift", "Maruti", "Blue", "Hatchback", "1197CC", "KA05IJ7890", "Suresh"));
        cars.add(new CarDTO("Venue", "Hyundai", "Grey", "Compact SUV", "1197CC", "KA06KL1122", "Ramesh"));
        cars.add(new CarDTO("Scorpio N", "Mahindra", "Green", "SUV", "1997CC", "KA07MN3344", "Arjun"));
        cars.add(new CarDTO("Harrier", "Tata", "Orange", "SUV", "1956CC", "KA08OP5566", "Varun"));
        cars.add(new CarDTO("Baleno", "Maruti", "White", "Hatchback", "1197CC", "KA09QR7788", "Prashanth"));
        cars.add(new CarDTO("Fortuner", "Toyota", "Black", "SUV", "2755CC", "KA10ST9900", "Ravi"));


        System.out.println("All car names:");
        for (CarDTO dto : cars) {
            System.out.println(dto.getName());
        }
        System.out.println("");
            System.out.println("All Car Brand:");
            for(CarDTO dto1 : cars){
                System.out.println(dto1.getBrand());
            }

        System.out.println("");
        System.out.println("All Car Color:");
        for(CarDTO color: cars){
            System.out.println(color.getColor());
        }
        System.out.println("");
        System.out.println("All Car Type:");
        for(CarDTO type: cars){
            System.out.println(type.getType());
        }
        System.out.println("");
        System.out.println("All Car Color:");
        for(CarDTO color: cars){
            System.out.println(color.getColor());
        }
        System.out.println("");
        System.out.println("All Car Capacity:");
        for(CarDTO capacity: cars){
            System.out.println(capacity.getCapacity());
        }
        System.out.println("");
        System.out.println("All Car Number:");
        for(CarDTO number: cars){
            System.out.println(number.getNumber());
        }
        System.out.println("");
        System.out.println("All Car Owner:");
        for(CarDTO owner: cars){
            System.out.println(owner.getOwner());
        }


    }
}
