package com.Xworkz.User;

import com.Xworkz.Internal.Laptop;

public class OperatingSystem {
    protected Laptop laptop;
    public OperatingSystem(Laptop laptop){
        this.laptop=laptop;
    }
    public void Ryzen(){
        if(this.laptop!=null)
        {
            this.laptop.processor();
        }
    }
}
