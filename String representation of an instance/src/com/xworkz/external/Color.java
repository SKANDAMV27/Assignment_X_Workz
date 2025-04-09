package com.xworkz.external;

import com.xworkz.internal.Red;

public class Color extends Red {
    private String name;
    private int lighter;
    private String things;
    public Color(String name,int lighter,String things){
        this.name=name;
        this.lighter=lighter;
        this.things=things;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", lighter=" + lighter +
                ", things='" + things + '\'' +
                '}';
    }
}
