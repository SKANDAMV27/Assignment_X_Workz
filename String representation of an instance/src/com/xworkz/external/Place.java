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
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Place)
            {
                System.out.println("compare: ");
                Place place = this;
                Place place1 = (Place) obj;
                if(place1.placeName==place.placeName && place.grade == place1.grade && place.distance == place1.distance){
                    System.out.println("Compare With Things: "+(place1==place));
                    return true;
                }
          }

        }
        return false;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
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
