package com.Xworkz.implem;

import com.Xworkz.Internal.Bus;

public class BusImp implements Bus {
    public BusImp(){
        System.out.println("No args Bus IMp as constructor");
    }

    @Override
    public void collection() {
        System.out.println("Bus Collection");

    }
}
