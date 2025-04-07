package com.XworkZ;

public class LatopDetails {
    public void details(Laptop laptop)
    {
        laptop.color();
        laptop.company();
        laptop.processor();
        laptop.size();
        laptop.weight();
        if(laptop instanceof ElectronicDevice)
        {
            ElectronicDevice electronicDevice = (ElectronicDevice) laptop;
            electronicDevice.device();
        }
    }
}
