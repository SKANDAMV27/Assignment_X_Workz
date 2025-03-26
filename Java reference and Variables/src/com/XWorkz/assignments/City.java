package com.XWorkz.assignments;

public class City {
    String cityName;
    Ward[] ward;
    public void City(String cityName,Ward[] ward)
    {
        this.cityName=cityName;
        this.ward=ward;
    }
    void display()
    {
        System.out.println("City Details");
        System.out.println("City Name: "+cityName);
        if(cityName!=null)
        {
            System.out.println("Ward:"+ward);
            for(Ward wards: ward) {
                wards.displayWard();
            }
        }else
        {
            System.out.println("Not a Null:");
        }
    }

}
