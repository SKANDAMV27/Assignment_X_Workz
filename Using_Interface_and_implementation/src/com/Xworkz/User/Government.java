package com.Xworkz.User;

import com.Xworkz.Internal.Consitution;

public class Government {
    protected Consitution consitution;
    public Government(Consitution consitution){
        this.consitution=consitution;
        System.out.println("No args as Government Constructor");
    }
    public void Vote(){
        if(this.consitution!=null){
            this.consitution=consitution;
            System.out.println("Vote Runner");
        }
        else {
            System.out.println("Null Value");
        }
    }
}
