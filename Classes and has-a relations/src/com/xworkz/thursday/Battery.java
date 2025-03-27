package com.xworkz.thursday;

public class Battery {
    static final String companyName="EXID";
    private Voltage voltage;
    void Battery(Voltage voltage)
    {
        this.voltage=voltage;
    }
    void displayBattery()
    {
        System.out.println("Battery Display Runner:");
        if(voltage!=null)
        {
            voltage.setType("High");
            voltage.setVolt(45);
            System.out.println("Voltage runner: "+companyName);
            System.out.println("Voltage Type: "+voltage.getVolt());
            System.out.println("Voltage: "+voltage.getType());
        }else {
            System.out.println("Voltage Null");
        }
    }
}
