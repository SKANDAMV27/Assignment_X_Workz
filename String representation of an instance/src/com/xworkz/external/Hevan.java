package com.xworkz.external;

import com.xworkz.internal.Thirthahalli;

public class Hevan extends Thirthahalli {
    private int distance;
    private String place;
    private char grade;
    public Hevan(int distance,String place,char grade)
    {
        this.distance=distance;
        this.place=place;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 896;
    }
    @Override
    public String toString() {
        return "Hevan{" +
                "distance=" + distance +
                ", place='" + place + '\'' +
                ", grade=" + grade +
                '}';
    }
}
