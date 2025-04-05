package com.XWorkz.inheritence.Internal;

public class Skanda extends Student{
    public Skanda()
    {
        super();
        System.out.println("No args Skanda Student Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Skanda M V");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch ISE");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21IS103");
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
