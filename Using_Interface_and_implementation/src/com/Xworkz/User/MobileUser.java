package com.Xworkz.User;

import com.Xworkz.Internal.Mobile;

public class MobileUser {
    public Mobile mobile;
    public MobileUser(Mobile mobile){
        this.mobile=mobile;
        System.out.println("No args Mobile User Constructor");
    }
    public void Andriod(){
        if(this.mobile!=null){
            this.mobile.iphone();
            System.out.println("Andriod Mobile.");
        }
        else{
            System.out.println("Null Value");
        }
    }
}
