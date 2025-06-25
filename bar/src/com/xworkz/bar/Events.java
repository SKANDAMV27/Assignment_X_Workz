package com.xworkz.bar;

public class Events {
    public void checkedEvents() throws ArithmeticException{
        if(true){
            System.out.println("Arithmetic Exception");

            throw new ArrayIndexOutOfBoundsException("I am for Checking");
        }
    }
    public void unCheckedEvents(){
        if(true){
            throw new RuntimeException("Runtime Exception");
        }
    }
}
