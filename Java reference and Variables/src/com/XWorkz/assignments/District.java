package com.XWorkz.assignments;

public class District {
    String districtName="Shivamogga";
    int districtId=450;
    String memberName="Skanda";
    String districtShoetName="KA";
    public void District(String districtName,int districtId,String memberName,String districtShoetName)
    {
        this.districtName=districtName;
        this.districtId=districtId;
        this.memberName=memberName;
        this.districtShoetName=districtShoetName;
    }
    void displayDistrict(){
        System.out.println("District Details: ");
        System.out.println("district Name: "+districtName);
        System.out.println("district Id: "+districtId);
        System.out.println("member Name: "+memberName);
        System.out.println("district Shot Name: "+districtShoetName);

    }
}
