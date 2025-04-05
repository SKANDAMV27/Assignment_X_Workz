package com.XWorkz.inheritence.Internal;

public class Faran extends Student{
    public Faran()
    {
        super();
        System.out.println("No args Faran Student Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Farhan Kahan");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch AIML");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4PS21AI107");
    }@Override
    public void college()
    {
        System.out.println("Student College PESIT");
    }
    @Override
    public void year()
    {
        System.out.println("Students Admission Year 2021");
    }
}
