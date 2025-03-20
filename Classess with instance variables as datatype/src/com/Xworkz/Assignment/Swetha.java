package com.Xworkz.Assignment;

public class Swetha {
    Rubber rubber;
    Swetha(Rubber rubber)
    {
        this.rubber=rubber;
    }
    void useRubber(Rubber[] rubber)
    {
        for(Rubber rubbers:rubber){
            if(rubber!=null)
            {
                this.rubber.colour();
            }
            else {
                System.out.println("NULL Value");

            }

        }
    }
}
