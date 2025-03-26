package com.XWorkz.assignments;

public class Minister {
    String ministerName="Sagar";
    Portfolio portfolio;
    House house;
    PersonAssistant personAssistant;
    public  Minister(String Minister,   Portfolio portfolio, House house, State state){
        this.ministerName=ministerName;
        this.portfolio=portfolio;
        this.house=house;
        this.personAssistant=personAssistant;
    }
    public void dispalyMinister()
    {
        System.out.println("Minister Name: "+ministerName);
        if(portfolio!=null)
        {
            portfolio.displayPortfolio();
        }else {
            System.out.println("Null Value");
        }
        if(house!=null)
        {
            System.out.println("House:");
            house.displayHouse();
        }else{
            System.out.println("Null Value");
        }
        if(personAssistant!=null)
        {
            System.out.println("Personal Assistant: ");
            personAssistant.displayPersonAssistant();
        }else{
            System.out.println("Null Value");
        }
    }

}
