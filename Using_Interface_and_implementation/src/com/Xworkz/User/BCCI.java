package com.Xworkz.User;

import com.Xworkz.Internal.ICCC;

public class BCCI {
    protected ICCC iccc;
    public BCCI(ICCC iccc){
        this.iccc=iccc;
        System.out.println("No args as BCCI Constructor");
    }
    public void Team(){
        if(this.iccc!=null){
            this.iccc.fairplay();
            System.out.println("Team Player");
        }
        else {
            System.out.println("Not An null Value");
        }
    }

}
