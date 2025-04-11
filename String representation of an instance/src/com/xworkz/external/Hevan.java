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
    public boolean equal(Object obj)
    {
       if(obj!=null)
       {
           System.out.println("No Null Value");
           if(obj instanceof Hevan)
           {
              Hevan hevan = this;
              Hevan hevan1 = (Hevan) obj;
              if(hevan.grade==hevan1.grade && hevan.place==hevan1.place && hevan1.distance==hevan.distance){
                  System.out.println("Compare");
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

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public String getPlace()
    {
        return place;
    }
    public void setPlace(String place)
    {
        this.place=place;
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
