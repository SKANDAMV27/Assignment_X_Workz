package com.Xworkz.implem;

import com.Xworkz.Internal.Laptop;

public class LaptopImpl implements Laptop {
    public LaptopImpl(){
        System.out.println("No args Laptop as a Constructor");
    }
    @Override
    public void processor() {
        System.out.println("Processor Runner");
    }
}
