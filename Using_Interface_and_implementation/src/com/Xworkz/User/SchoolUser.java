package com.Xworkz.User;

import com.Xworkz.Internal.School;

public class SchoolUser {
    public School school;
    public SchoolUser(School school){
        this.school=school;
        System.out.println("no args schoolUser constructor");
    }
    public void teacher(){
        if (this.school!=null){
            this.school.students();
            System.out.println("runner teacher");
        }
        else{
            System.out.println("null value");
        }
    }
}
