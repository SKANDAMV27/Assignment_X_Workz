package com.xworkz.external;

import com.xworkz.internal.Tyer;

public class Wheel extends Tyer {
    private String name;
    private String material;
    private int pressure;
    public Wheel(String name,String material,int pressure){
        this.material=material;
        this.name=name;
        this.pressure=pressure;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", pressure=" + pressure +
                '}';
    }
}
