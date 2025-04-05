package com.XWorkz.inheritence.Internal;

public class Pravith extends Student{
    public Pravith()
    {
        super();
        System.out.println("No args Pravith Student Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Pravith A P");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch ISE");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21IS075");
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
