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
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 45231;
    }
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("Null");
            if(obj instanceof Material){
                Wheel wheel = this;
                Wheel wheel1 = (Wheel) obj;
                if(wheel.name==wheel1.name && wheel.material==wheel1.material && wheel.material==wheel1.material){
                    System.out.println("Compare :"+(wheel==wheel1));
                    return false;
                }
            }

        }
        return true;
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
