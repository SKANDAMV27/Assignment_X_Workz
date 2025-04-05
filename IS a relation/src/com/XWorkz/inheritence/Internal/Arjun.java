package com.XWorkz.inheritence.Internal;

public class Arjun extends Student{
    public Arjun()
    {
        System.out.println("No args Arjun Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Arjun");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch CSE");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21CS021");
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
