package com.XWorkz.assignments;

public class Details {
    String detailName="Contry";
    int detailId=785;
    String detailStatus="Good";
    public void Details(String detailName,int detailId,String detailStatus){
        this.detailName=detailName;
        this.detailId=detailId;
        this.detailStatus=detailStatus;
    }
    void displayDetails()
    {
        System.out.println("Details:");
        System.out.println("Detail Name: "+detailName);
        System.out.println("Detail Id: "+detailId);
        System.out.println("Detail Status: "+detailStatus);

    }

}
