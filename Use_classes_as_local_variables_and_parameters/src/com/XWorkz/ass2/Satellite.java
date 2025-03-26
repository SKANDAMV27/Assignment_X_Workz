package com.XWorkz.ass2;

public class Satellite {
    private type Type;
    private int cost;
    private int weight;
    private String loadCapacity;
    public type getType()
    {
        return this.Type;
    }
    public void setType(type Type)
    {
        this.Type=Type;
    }
    public int getCost()
    {
        return this.cost;
    }
    public void setCost(int cost)
    {
        this.cost=cost;
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
        return this.loadCapacity;
    }
    public void setDesignedBy(String designedBy)
    {
        this.loadCapacity=designedBy;
    }
    public void showSatellite()
    {
        IdCard idcard1= new IdCard();
        Colors colors = new Colors();
         idcard1.setMateria("Fiber");
         idcard1.setDesignedBy("Skanda");
         idcard1.setWeight(2);

         IdCard idcard2 = new IdCard();
         Colors colors1= new Colors();
         idcard2.setMateria("Iron");
         idcard2.setWeight(45);
         idcard2.setDesignedBy("Sagar");

         IdCard[] idcards={idcard1,idcard2};
         for(IdCard idCard: idcards)
         {
             System.out.println(idCard.getDesignedBy());
             System.out.println(idCard.getWeight());
             System.out.println(idCard.getMaterial());
         }


    }
}
