package com.XWorkz.External;

public abstract class GoaTrip4 {
    public int distance;
    public String name;
    public char grade;
    public int amount;
    public GoaTrip4(int distance,String name,char grade){
        this.distance=distance;
        this.grade=grade;
        this.name=name;
    }
    public void plan4(){
        System.out.println("Name: "+this.name+" Grade: "+this.grade+" Distance: "+this.distance);
    }

    @Override
    public String toString() {
        return "[Name: "+name+"Grade: "+grade+" Distance: "+distance+"]";
    }
}
