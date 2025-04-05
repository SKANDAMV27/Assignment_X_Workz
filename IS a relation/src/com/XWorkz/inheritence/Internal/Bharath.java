package com.XWorkz.inheritence.Internal;

public class Bharath extends Student{
    public Bharath()
    {
        super();
        System.out.println("No args Bharath Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Bharath");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch ECE");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21EC054");
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
