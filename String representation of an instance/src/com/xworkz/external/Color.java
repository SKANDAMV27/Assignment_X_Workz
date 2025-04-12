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
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 789;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Color){
                System.out.println("Compare ");
                Color color = this;
                Color color1 = (Color) obj;
                if(color1.things==color.things && color1.name == color.name && color1.lighter == color.lighter){
                    System.out.println("Compare: "+(color1 == color));
                    return true;
                }
            }

        }
        return false;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getLighter()
    {
        return lighter;
    }
    public void setLighter(int lighter)
    {
        this.lighter=lighter;
    }
    public String getThings()
    {
        return things;
    }
    public void setThings(String things)
    {
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
