package com.XWorkz.assignments;

public class Security {
    String securityName="Passward";
    int securityId=41;
    String securityArea="Pin";
    Minister minister;
    public void Security(String securityName,String securityArea,int securityId)
    {
        this.minister=minister;
        this.securityName=securityName;
        this.securityId=securityId;
        this.securityArea=securityArea;
    }
    public void displaySecurity()
    {
        System.out.println("Security Name: "+securityName);
        System.out.println("Security Id: "+securityId);
        System.out.println("Security Area: "+securityArea);
        if(minister!=null)
        {
            System.out.println("Minister:");
            minister.dispalyMinister();
        }
    }
}
