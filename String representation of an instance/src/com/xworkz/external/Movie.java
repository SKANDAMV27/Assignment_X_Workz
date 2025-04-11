package com.xworkz.external;

import  com.xworkz.internal.Arasu;

public class Movie extends Arasu{
    private String name;
    private int rating;
    private String location;

    public Movie(String name,int rating,String location){

        this.name=name;
        this.location=location;
        this.rating=rating;

    }
    @Override
    public int hashCode()
    {
        System.out.println("Hashcode Movie: "+super.hashCode());
        return 18;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("It is not a Null");
            if(obj instanceof Movie)
            {
                System.out.println("Compare: ");

            }

        }
        return false;
    }
    public String getName()
    {
        return name;
    }

    
    @Override
    public String toString()
    {
        return ("MovieName:"+this.name+" Location:"+this.location+" Rating:"+this.rating);
    }

}
