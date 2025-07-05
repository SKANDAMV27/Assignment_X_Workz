package com.xworkz.stream.External;

import com.xworkz.stream.Internal.Country;
import com.xworkz.stream.Internal.CountryImp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class CountryRunner {
    public static void main(String[] args) {
        Country country = new CountryImp();
        Collection<String> countryImps = country.fetchAll();

        System.out.println("Display All The Country Names:");

        countryImps.stream().forEach(System.out::println);

        System.out.println("");

        System.out.println("A Countrs Name Start With I:");
        countryImps.stream().filter(c -> c.toLowerCase().startsWith("i")).forEach(System.out::println);

        System.out.println("");
        System.out.println("A Country's Name End With G: ");
        countryImps.stream().filter(c-> c.toLowerCase().endsWith("g")).forEach(System.out::println);


        System.out.println("");
        System.out.println("Desending Order: ");
        countryImps.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("");
        System.out.println("Ascending Order: ");
        countryImps.stream().sorted().forEach(System.out::println);

        System.out.println("");
        System.out.println("A Country's Name End With A:");
        countryImps.stream().filter(c-> c.toLowerCase().endsWith("a")).forEach(System.out::println);

        System.out.println("");
        System.out.println("A Country's Name Contains More Then 6 Characture: ");
        countryImps.stream().filter(c->c.length()>6).forEach(System.out::println);

        System.out.println("");
        System.out.println("A Country Name Contains Lesser Then 4 Characture: ");
        countryImps.stream().filter(c->c.length()<4).forEach(System.out::println);

        System.out.println("");
        System.out.println("A Country Name Which Contains O:");
        countryImps.stream().filter(c->c.toLowerCase().contains("o")).forEach(System.out::println);

        System.out.println("");
        System.out.println("A Country Name Count:");
        countryImps.stream().forEach(c -> System.out.println(c + " = " + c.length()));

        System.out.println("");
        System.out.println("A Country Name Palindrom: ");
        countryImps.stream().filter(c->palindrom(c)).forEach(System.out::println);



    }

    private static boolean palindrom(String world){
       String lower =  world.toLowerCase();

        return new StringBuilder(lower).reverse().toString().equals(lower);

    }



}
