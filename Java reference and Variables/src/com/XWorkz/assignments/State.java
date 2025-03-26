package com.XWorkz.assignments;

public class State {
    String name;
    String id;
    public void State(String name,String id)
    {
        this.name=name;
        this.id=id;
    }
    void display()
    {
        System.out.println("State Details: ");
        System.out.println("State Name: "+name);
        System.out.println("State Id: "+id);
    }
}
