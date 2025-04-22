package com.Xworkz.User;

import com.Xworkz.Internal.Aakhil;
import com.Xworkz.Internal.Abhi;

public class AbhiUser {
    public Abhi abhi;
    public AbhiUser(Abhi abhi){
        this.abhi=abhi;
        System.out.println("No args Constructor");
    }
    public void person(){
        if(this.abhi!=null){
            this.abhi.student();
            System.out.println("Person Runner");
        }
        else{
            System.out.println("No Value");
        }
    }
}

