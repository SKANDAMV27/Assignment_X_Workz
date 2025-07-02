package com.xworkz.collection.dto;

import java.io.Serializable;

public class CarDTO implements Serializable {
    private String name;
    private String brand;
    private String color;
    private String type;
    private String capacity;
    private String number;
    private String owner;

    public  CarDTO(){
        System.out.println("No args Constructor.");
    }

    public CarDTO(String name, String brand, String color, String type, String capacity, String number, String owner) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.capacity = capacity;
        this.number = number;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", capacity='" + capacity + '\'' +
                ", number='" + number + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
