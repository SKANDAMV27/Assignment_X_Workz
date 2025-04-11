package com.xworkz.external;

import com.xworkz.internal.Car;

public class Vehicle extends Car {
    private String company;
    private int price;
    private char grade;
    private String color;
    public Vehicle(String color,String company,int price,char grade){
        this.color=color;
        this.grade=grade;
        this.company=company;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 521;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("Null object");
            if(obj instanceof Vehicle)
            {
                Vehicle vehicle = this;
                Vehicle vehicle1 = (Vehicle) obj;
                if(vehicle1.price==vehicle.price && vehicle1.company==vehicle.company && vehicle1.grade==vehicle.grade && vehicle1.color==vehicle.color){
                    System.out.println("Compare: ");
                    return true;
                }
            }
        }
        return false;
    }
    public String getCompany()
    {
        return company;
    }
    public void setCompany(String company)
    {
        this.company=company;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public char getGrade()
    {
        return grade;
    }
    public void setGrade(char grade)
    {
        this.grade=grade;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    @Override
    public String toString() {
        return "Vehicle[" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                ", color='" + color + '\'' +
                ']';
    }
}
