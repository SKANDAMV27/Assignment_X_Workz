package com.XWorkz.inheritence;

public class Phone extends Mobile{
    public Phone(){
        super();
        System.out.println("No args Phone Constructor");
    }
    @Override
    public void call()
    {
        System.out.println("Mobile is used for call phone");
    }
    @Override
    public void text()
    {
        System.out.println("Mobile/Phone is used to Text");
    }
    @Override
    public void Mi()
    {
        System.out.println("Mi is one of a company of Mobile/Phone");
    }
    @Override
    public void types()
    {
        System.out.println("Types of Mobile/Phone");
    }
    @Override
    public void price()
    {
        System.out.println("Mobile/Phone Price");
    }
}
