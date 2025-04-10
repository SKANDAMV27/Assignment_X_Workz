package com.xworkz.external;

import com.xworkz.internal.Shivamogga;

public class Place extends Shivamogga {
    private String placeName;
    private int distance;
    private char grade;
    public Place(String placeName,int distance,char grade)
    {
        this.distance=distance;
        this.grade=grade;
        this.placeName=placeName;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 896;
    }
    @Override
    public String toString() {
        return "Place{" +
                "placeName='" + placeName + '\'' +
                ", distance=" + distance +
                ", grade=" + grade +
                '}';
    }
}
