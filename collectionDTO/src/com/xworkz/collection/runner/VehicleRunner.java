package com.xworkz.collection.runner;

import com.xworkz.collection.dto.VehicleDTO;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class VehicleRunner {

    public static void main(String[] args) {
        Collection<VehicleDTO> vehicles = new HashSet<>();

        vehicles.add(new VehicleDTO("Toyota", "Innova", "Car", "White", "Diesel", 2393, "KA02AB1234", "Manoj", "Bangalore", 2020));
        vehicles.add(new VehicleDTO("Honda", "Activa", "Scooter", "Black", "Petrol", 109, "KA03XY5678", "Sneha", "Mysore", 2022));
        vehicles.add(new VehicleDTO("Tata", "Nexon EV", "Car", "Blue", "Electric", 0, "KA04UV2345", "Rahul", "Hubli", 2023));
        vehicles.add(new VehicleDTO("Bajaj", "Pulsar", "Bike", "Red", "Petrol", 150, "KA05GH6789", "Harsha", "Shimoga", 2019));
        vehicles.add(new VehicleDTO("Mahindra", "Thar", "SUV", "Black", "Diesel", 2184, "KA06MN4321", "Skanda", "Thirthahalli", 2021));
        vehicles.add(new VehicleDTO("Hero", "Splendor", "Bike", "Silver", "Petrol", 97, "KA07QR7890", "Divya", "Chikmagalur", 2018));
        vehicles.add(new VehicleDTO("Hyundai", "Creta", "Car", "Red", "Petrol", 1497, "KA08ST3456", "Pooja", "Davanagere", 2020));
        vehicles.add(new VehicleDTO("Royal Enfield", "Classic 350", "Bike", "Green", "Petrol", 349, "KA09UV9876", "Rohit", "Mangalore", 2023));
        vehicles.add(new VehicleDTO("Suzuki", "Access 125", "Scooter", "Blue", "Petrol", 124, "KA10WX6543", "Nisha", "Udupi", 2022));
        vehicles.add(new VehicleDTO("Kia", "Seltos", "Car", "White", "Petrol", 1493, "KA11YZ3210", "Meena", "Belgaum", 2021));


        System.out.println("Vehicle Brand and Model:");
        Iterator<VehicleDTO> iterator1 = vehicles.iterator();
        while (iterator1.hasNext()) {
            VehicleDTO v = iterator1.next();
            System.out.println(v.getBrand() + " " + v.getModel());
        }

        System.out.println("\n============================\n");


        System.out.println("Full Vehicle Details:");
        Iterator<VehicleDTO> iterator2 = vehicles.iterator();
        while (iterator2.hasNext()) {
            VehicleDTO v = iterator2.next();
            System.out.println("Brand        : " + v.getBrand());
            System.out.println("Model        : " + v.getModel());
            System.out.println("Type         : " + v.getType());
            System.out.println("Color        : " + v.getColor());
            System.out.println("Fuel Type    : " + v.getFuelType());
            System.out.println("Engine CC    : " + v.getEngineCC());
            System.out.println("Reg. Number  : " + v.getRegistrationNo());
            System.out.println("Owner Name   : " + v.getOwnerName());
            System.out.println("City         : " + v.getCity());
            System.out.println("Year         : " + v.getManufactureYear());
            System.out.println("----------------------------------------");
        }
    }
}
