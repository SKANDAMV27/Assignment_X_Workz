package com.xworkz.external;

import com.xworkz.internal.Cricket;

public class Tourlment extends Cricket {
    private String name;
    private int members;
    private String Day;
    public Tourlment(String name,int members,String Day)
    {
        this.Day=Day;
        this.members=members;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 19872;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("Null");
            if(obj instanceof Tourlment){
                Tourlment tourlment = this;
                Tourlment tourlment1 = (Tourlment) obj;
                if(tourlment.name==tourlment1.name && tourlment.members==tourlment1.members && tourlment.Day==tourlment1.Day){
                    System.out.println("Compare :"+(tourlment==tourlment1));
                    return false;
                }
            }

        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", Day='" + Day + '\'' +
                '}';
    }
}
