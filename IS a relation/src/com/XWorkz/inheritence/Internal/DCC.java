package com.XWorkz.inheritence.Internal;

public class DCC extends Bank{
    public DCC()
    {
        super();
        System.out.println("No args DCC Bank Constructor");
    }
    @Override
    public void name()
    {
        System.out.println("Bank Name");
    }
    @Override
    public void code()
    {
        System.out.println("Bank Code");
    }
    @Override
    public void email()
    {
        System.out.println("Bank Email ID");
    }
    @Override
    public void managerName()
    {
        System.out.println("Bank Manager Name");
    }
    @Override
    public void branch()
    {
        System.out.println("Bank Branch");
    }
}
