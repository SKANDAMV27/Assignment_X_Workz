package com.XWorkz.inheritence.Internal;

public class Adhya extends Student{
    public Adhya()
    {
        super();
        System.out.println("No args Adhya Student Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Adhya K S");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch Computer Science");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4MI21CS003");
    }
    @Override
    public void college()
    {
        System.out.println("Student College MITE");
    }
    @Override
    public void year()
    {
        System.out.println("Students Admission Year 2021");
    }
}
