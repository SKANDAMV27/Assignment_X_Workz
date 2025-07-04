package com.xworkz.stream.External;

import com.xworkz.stream.Internal.Country;
import com.xworkz.stream.Internal.CountryImp;

import java.util.ArrayList;
import java.util.Collection;

public class CountryRunner {
    public static void main(String[] args) {
        Country country = new CountryImp();
        Collection<String> countryImps = country.fetchAll();

        System.out.println("Display All The Country Names:");

        countryImps.stream().forEach(System.out::println);

        System.out.println("");
    }



}
