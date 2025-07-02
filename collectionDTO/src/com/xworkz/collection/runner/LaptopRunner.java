package com.xworkz.collection.runner;

import com.xworkz.collection.dto.LaptopDTO;

import java.util.ArrayList;
import java.util.Collection;

public class LaptopRunner {

    public static void main(String[] args) {
        Collection<LaptopDTO> laptop = new ArrayList<>();

        laptop.add(new LaptopDTO("MacBook Pro", "Apple", "Silver", "Business", "16GB/1TB SSD", "MBP2023-001", "Skanda"));
        laptop.add(new LaptopDTO("ROG Strix", "Asus", "Black", "Gaming", "32GB/1TB SSD", "ROG-ASUS-7788", "Manoj"));
        laptop.add(new LaptopDTO("ThinkPad X1", "Lenovo", "Black", "Business", "16GB/512GB SSD", "TPX1-3344", "Kiran"));
        laptop.add(new LaptopDTO("Pavilion 15", "HP", "Blue", "Student", "8GB/1TB HDD", "HP-PAV-1122", "Deepak"));
        laptop.add(new LaptopDTO("Inspiron 15", "Dell", "Grey", "Home", "8GB/256GB SSD", "DELL-INSP-5566", "Suresh"));
        laptop.add(new LaptopDTO("Swift X", "Acer", "Green", "Ultrabook", "16GB/512GB SSD", "ACER-SWX-9876", "Ramesh"));
        laptop.add(new LaptopDTO("ZenBook 14", "Asus", "Dark Blue", "Ultrabook", "16GB/1TB SSD", "ASUS-ZB14-1111", "Arjun"));
        laptop.add(new LaptopDTO("Latitude 7420", "Dell", "Black", "Business", "16GB/512GB SSD", "LAT-DELL-2020", "Varun"));
        laptop.add(new LaptopDTO("IdeaPad Slim 5", "Lenovo", "Grey", "Student", "8GB/512GB SSD", "LEN-SL5-7789", "Prashanth"));
        laptop.add(new LaptopDTO("EliteBook 840", "HP", "Silver", "Business", "16GB/512GB SSD", "HP-EB840-2233", "Ravi"));

        System.out.println("Laptop Names:");
        for(LaptopDTO laptopDTO : laptop){
            System.out.println(laptopDTO.getName());
        }

        System.out.println("");
        System.out.println("Laptop Brand Name:");
        for(LaptopDTO laptopDTO : laptop){
            System.out.println(laptopDTO.getBrand());
        }

        System.out.println("");
        System.out.println("Laptop Colors:");
        for(LaptopDTO laptopDTO : laptop){
            System.out.println(laptopDTO.getColor());
        }

        System.out.println("");
        System.out.println("Laptop Type:");
        for(LaptopDTO laptopDTO: laptop){
            System.out.println(laptopDTO.getType());
        }

        System.out.println("");
        System.out.println("Laptop Capacity:");
        for(LaptopDTO laptopDTO : laptop){
            System.out.println(laptopDTO.getCapacity());
        }

        System.out.println("");
        System.out.println("Laptop Number:");
        for(LaptopDTO laptopDTO : laptop){
            System.out.println(laptopDTO.getNumber());
        }

        System.out.println("");
        System.out.println("Laptop Owners:");
        for(LaptopDTO laptopDTO : laptop){
            System.out.println(laptopDTO.getOwner());
        }

    }



}
