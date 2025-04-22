package com.Xworkz.User;

import com.Xworkz.Internal.JCB;

public class JCBUser {
    public JCB jcb;
    public JCBUser(JCB jcb){
        this.jcb=jcb;
        System.out.println("No args JCB User Constructor");
    }
    public void time(){
        if(this.jcb!=null){
            this.jcb.work();
            System.out.println("Time of JCB Work");
        }
        else{
            System.out.println("Null Value");
        }
    }
}
