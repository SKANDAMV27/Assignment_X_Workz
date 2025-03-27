package com.xworkz.thursday;

public class Remote {
    static final String remoteCompany="TATA SKY";
    private Battery battery;
    void Remote(Battery battery)
    {
        this.battery=battery;
    }
    public void displayRemote()
    {
        if(battery!=null)
        {
            battery.displayBattery();
            System.out.println("Battery Runner:");
        }else{
            System.out.println("No agrs Null barttery");
        }
    }
}
