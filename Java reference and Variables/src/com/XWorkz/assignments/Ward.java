package com.XWorkz.assignments;

public class Ward {
    String wardName;
    public void ward(String wardName)
    {
        this.wardName=wardName;
    }
    void displayWard()
    {
        System.out.println("Ward Details: ");
        System.out.println("Ward Name: "+wardName);
    }
}
