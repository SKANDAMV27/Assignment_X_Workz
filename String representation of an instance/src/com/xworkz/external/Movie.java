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
                Movie movie = this;
                Movie movie1 = (Movie) obj;
                if(movie.name==movie1.name && movie.rating==movie1.rating && movie.location==movie1.location)
                {
                    System.out.println("Both are same");
                    return true;
                }
            }

        }
        return false;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location)
    {
        this.location=location;
    }
    public int getRating()
    {
        return rating;
    }
    public void setRating(int rating)
    {
        this.rating=rating;
    }



    
    @Override
    public String toString()
    {
        return ("MovieName:"+this.name+" Location:"+this.location+" Rating:"+this.rating);
    }

}
