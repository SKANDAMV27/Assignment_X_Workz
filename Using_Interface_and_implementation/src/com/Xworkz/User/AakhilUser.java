package com.Xworkz.User;

import com.Xworkz.Internal.Aakhil;

public class AakhilUser {
    public Aakhil aakhil;
    public AakhilUser(Aakhil aakhil){
        this.aakhil=aakhil;
        System.out.println("No args Constructor");
    }
    public void person(){
        if(this.aakhil!=null){
            this.aakhil.student();
            System.out.println("Person Runner");
        }
        else{
            System.out.println("No Value");
        }
    }
}
