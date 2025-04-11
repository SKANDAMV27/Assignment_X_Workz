package com.xworks.external;

import com.xworks.internal.Tshirt;

public class Runner {
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt();
        tshirt1.setBrand("Nike");
        tshirt1.setPrice(450);
        tshirt1.setSize(24);
        tshirt1.setAvaliable(true);

        Tshirt tshirt2 = new Tshirt();
        tshirt2.setBrand("Nike");
        tshirt2.setPrice(450);
        tshirt2.setSize(24);
        tshirt2.setAvaliable(true);

        System.out.println("chect same location: "+(tshirt1=tshirt1));
        boolean same = tshirt2.equals(tshirt1);
        System.out.println(same);



    }
}
