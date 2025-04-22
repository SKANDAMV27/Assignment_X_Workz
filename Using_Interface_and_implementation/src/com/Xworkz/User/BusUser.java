package com.Xworkz.User;

import com.Xworkz.Internal.Bus;

public class BusUser {
    public Bus bus;
    public BusUser(Bus bus){
        System.out.println("No args Bus User Constructor.");
    }
    public void line(){
        if(this.bus!=null){
            this.bus.collection();
            System.out.println("Bus Line.");
        }
        else
        {
            System.out.println("Null Value ");
        }
    }

}
