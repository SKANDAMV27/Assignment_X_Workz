package com.xworkz.thursday;

public class Wire {
    static final int wireSize=100;
    private Quality quality;
   public void Wire(Quality quality)
    {
        this.quality=quality;
    }
    void displayWire()
    {
        if(quality!=null)
        {
            quality.setQualityRating(5);
            quality.setQualityType("Good");
            System.out.println("Wire Size: "+wireSize+"cm");
            System.out.println("Wire Quality Rating: "+quality.getQualityType());
            System.out.println("Wire Quality Type: "+quality.getQualityRating());
        }else{
            System.out.println("Null Wire");
        }
    }
}
