package com.XWorkz.inheritence;

public class Amount extends Money{
    public Amount()
    {
        super();
        System.out.println("No args Amount constructor");
    }
    @Override
    public void cash()
    {
        System.out.println("Amount is in the form of Cash");
    }
    @Override
    public void UIP()
    {
        System.out.println("UIP Mode Amount");
    }
    @Override
    public void payment()
    {
        System.out.println("Payment Mode Amount");
    }
    @Override
    public void loanAmont() {
        System.out.println("Loan Ammount");
    }
    @Override
    public void intrest() {
        System.out.println("Intrest Amount");
    }
}
