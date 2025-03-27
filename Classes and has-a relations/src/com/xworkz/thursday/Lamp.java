package com.xworkz.thursday;

public class Lamp {
    static final int lampSize=40;
    private Warranty warranty;
    public void Lamp(Warranty warranty){
        this.warranty=warranty;
    }
    public void displayLamp()
    {
        if(warranty!=null)
        {
            warranty.setEndDate(14);
            warranty.setEndDate(15);
            System.out.println("Warrenty Start Date: "+warranty.getStartDate());
            System.out.println("Warrenty End Date: "+warranty.getEndDate());
            System.out.println("Lamp Size: "+lampSize);
        }else {
            System.out.println("Null Lamp");
        }
    }
}
