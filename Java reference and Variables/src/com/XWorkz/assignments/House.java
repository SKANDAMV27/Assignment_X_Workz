package com.XWorkz.assignments;

public class House {
    Details[] details;
    Room[] room;
    public void House(Details[] details,Room[] room)
    {
        this.details=details;
        this.room=room;
    }
    void displayHouse()
    {
        System.out.println("House Details: ");
        if(details!=null)
        {
            System.out.println("House Details: "+details);
            for(Details details1:details)
                details1.displayDetails();
        }else {
            System.out.println("Null Value");
        }
    }
}
