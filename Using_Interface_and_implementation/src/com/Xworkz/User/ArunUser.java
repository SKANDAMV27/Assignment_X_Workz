package com.Xworkz.User;


import com.Xworkz.Internal.Arun;

public class ArunUser {
    public Arun arun;
    public ArunUser(Arun arun){
        this.arun=arun;
        System.out.println("No args Constructor");
    }
    public void person(){
        if(this.arun!=null){
            this.arun.student();
            System.out.println("Person Runner");
        }
        else{
            System.out.println("No Value");
        }
    }
}
