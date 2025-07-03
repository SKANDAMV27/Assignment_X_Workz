package com.xworkz.lamda.External;

import com.xworkz.lamda.Internal.Bottle;
import com.xworkz.lamda.Internal.Customer;

public class MainRunner {

    public static void main(String[] args) {

        Bottle bottle = (int no)->{
            System.out.println("Running Lamda Expression "+no);
            if(no>10){
                return true;
            }
            return false;
        };

        Customer customer = new Customer();
        customer.buy(bottle);
    }
}
