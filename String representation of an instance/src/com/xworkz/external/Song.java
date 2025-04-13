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
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Song){
                System.out.println("Comapare: ");
                Song song = this;
                Song song1 =(Song) obj;
                if(song.rating==song1.rating && song.name==song1.name && song.location==song1.location){
                    System.out.println("Compare With the Things: "+(song1==song));
                    return true;
                }
            }

        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return ("MovieName:"+this.name+" Location:"+this.location+" Rating:"+this.rating);
    }
}
