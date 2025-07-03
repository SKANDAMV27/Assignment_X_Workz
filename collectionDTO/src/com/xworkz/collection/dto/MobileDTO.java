package com.xworkz.collection.dto;

import java.io.Serializable;

public class MobileDTO implements Serializable {
    private String brand;
    private String model;
    private double price;
    private int ram; //
    private int storage; //
    private String processor;
    private String color;
    private String os;
    private int battery;
    private int releaseYear;

    public MobileDTO() {
        System.out.println("No args Constructor:");
    }

    public MobileDTO(String brand, String model, double price, int ram, int storage, String processor,
                     String color, String os, int battery, int releaseYear) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.color = color;
        this.os = os;
        this.battery = battery;
        this.releaseYear = releaseYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "MobileDTO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", ram=" + ram + "GB" +
                ", storage=" + storage + "GB" +
                ", processor='" + processor + '\'' +
                ", color='" + color + '\'' +
                ", os='" + os + '\'' +
                ", battery=" + battery + "mAh" +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
