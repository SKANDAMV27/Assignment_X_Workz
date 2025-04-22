package com.Xworkz.User;

import com.Xworkz.Internal.College;

public class CollegeUser {
    public College college;
    public CollegeUser(College college){
        this.college=college;
        System.out.println("No args as a Constructor");
    }
    public void branch(){
        if(this.college!=null){
            this.college.stream();
            System.out.println("College Branch");
        }else {
            System.out.println("Null Value");
        }
    }
}
