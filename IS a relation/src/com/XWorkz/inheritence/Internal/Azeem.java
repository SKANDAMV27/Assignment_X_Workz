package com.XWorkz.inheritence.Internal;

public class Azeem extends Student{
    public Azeem()
    {
        super();
        System.out.println("No Args Azeem Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Azeem");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch EEE");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21EE020");
    }
    @Override
    public void college()
    {
        System.out.println("Student College JNNCE");
    }
    @Override
    public void year()
    {
        System.out.println("Students Admission Year 2021");
    }
}
