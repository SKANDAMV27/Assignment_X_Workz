package com.xworkz.external;

import com.xworkz.internal.Hunahuna;

public class Song extends Hunahuna {
    private String name;
    private int rating;
    private String location;

    public Song(String name,int rating,String location){

        this.name=name;
        this.location=location;
        this.rating=rating;

    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 300;
    }
    @Override
    public String toString()
    {
        return ("MovieName:"+this.name+" Location:"+this.location+" Rating:"+this.rating);
    }
}
