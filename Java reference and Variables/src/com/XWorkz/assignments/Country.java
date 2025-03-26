package com.XWorkz.assignments;
public class Country{
    String countryName="India";
    PrimeMinister[] primeminister;
    void Country(String countryName,PrimeMinister[] primeminister)
    {
        this.countryName=countryName;
        this.primeminister=primeminister;
    }
    void display()
    {
        District district = new District();
        District[] districts ={district};
        Details details = new Details();
        Details[] details1={details};
        House house= new House();
        House[] houses={house};
        PrimeMinister primeMinister = new PrimeMinister();
        PrimeMinister[] primeMinisters={primeMinister};


    }

}