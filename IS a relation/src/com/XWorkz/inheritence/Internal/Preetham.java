package com.XWorkz.inheritence.Internal;

public class Preetham extends Student{
    public Preetham()
    {
        super();
        System.out.println("No Args as Preetham Student Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Preetham");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch ISE");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21IS076");
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
