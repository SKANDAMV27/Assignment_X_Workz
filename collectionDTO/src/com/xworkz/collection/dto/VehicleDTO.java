package com.xworkz.collection.dto;

import java.io.Serializable;

public class VehicleDTO implements Serializable {
    private String brand;
    private String model;
    private String type;
    private String color;
    private String fuelType;
    private int engineCC;
    private String registrationNo;
    private String ownerName;
    private String city;
    private int manufactureYear;

    public VehicleDTO() {
        System.out.println("No args Constructor");
    }

    public VehicleDTO(String brand, String model, String type, String color, String fuelType,
                      int engineCC, String registrationNo, String ownerName, String city, int manufactureYear) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.fuelType = fuelType;
        this.engineCC = engineCC;
        this.registrationNo = registrationNo;
        this.ownerName = ownerName;
        this.city = city;
        this.manufactureYear = manufactureYear;
    }

    // Getters and setters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getType() { return type; }
    public String getColor() { return color; }
    public String getFuelType() { return fuelType; }
    public int getEngineCC() { return engineCC; }
    public String getRegistrationNo() { return registrationNo; }
    public String getOwnerName() { return ownerName; }
    public String getCity() { return city; }
    public int getManufactureYear() { return manufactureYear; }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", engineCC=" + engineCC +
                ", registrationNo='" + registrationNo + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", city='" + city + '\'' +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}
