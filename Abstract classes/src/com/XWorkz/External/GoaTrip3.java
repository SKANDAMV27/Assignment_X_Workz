package com.XWorkz.External;

public abstract class GoaTrip3 {
    public String name;
    public int distance;
    public char grade;
    public GoaTrip3(String name,int distance,char grade){
        this.distance=distance;
        this.name=name;
        this.grade=grade;
    }
    public void plan3(){

    }


    @Override
    public String toString() {
        return "[ Distance: "+this.distance+" Name: "+this.name+" Grade:"+grade+"]";
    }
}
