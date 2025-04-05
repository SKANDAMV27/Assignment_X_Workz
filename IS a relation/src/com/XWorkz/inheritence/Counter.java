package com.XWorkz.inheritence;

public class Counter extends Brand{
    public Counter(){
        super();
        System.out.println("No args Counter Constructor");
    }
    @Override
    public void BP()
    {
        System.out.println("Counter Name BP");
    }
    @Override
    public void OMR()
    {
        System.out.println("Counter Name OMP");
    }
    @Override
    public void RS()
    {
        System.out.println("Counter Name RS");
    }
    @Override
    public void MC(){
        System.out.println("Counter Name MC");
    }
    @Override
    public void Beer()
    {
        System.out.println("Brand Beer Avaliable in Counter");
    }
}
