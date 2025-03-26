package com.XWorkz.ass2;

public class IdCard {
    private String material;
    private Colors colors;
    private int weight;
    private String designedBy;
    public String getMaterial()
    {
        return this.material;
    }
    public void setMateria(String material)
    {
        this.material=material;
    }
    public Colors getColors()
    {
        return colors;

    }
    public void setColors(Colors colors)
    {
        this.colors=colors;
    }
    public int getWeight()
    {
        return this.weight;
    }
    public void setWeight(int weight)
    {
        this.weight=weight;
    }
    public String getDesignedBy()
    {
        return this.designedBy;
    }
    public void setDesignedBy(String designedBy)
    {
        this.designedBy=designedBy;
    }
    public void showId(Jail[] jail)
    {
        System.out.println("Runner");
        if(jail!=null){
            for(Jail jails:jail)
            {
                System.out.println(jails.getName());
                System.out.println(jails.getLocation());
                System.out.println(jails.getJailerName());
                System.out.println(jails.getTotalCells());


            }
        }

    }
}

