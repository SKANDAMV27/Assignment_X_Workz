package com.XWorkz.inheritence.Internal;

public class ATM extends Bank{
    public ATM()
    {
        System.out.println("No args as a ATM Constructor");
    }
    @Override
    public void name()
    {
        System.out.println("Bank Name ATM");
    }
    @Override
    public void code()
    {
        System.out.println("Bank Code 577432");
    }
    @Override
    public void email()
    {
        System.out.println("Bank Email ID @gmail");
    }
    @Override
    public void managerName()
    {
        System.out.println("Bank Manager BOSS");
    }
    @Override
    public void branch()
    {
        System.out.println("Bank Branch Thirthahalli");
    }
}
