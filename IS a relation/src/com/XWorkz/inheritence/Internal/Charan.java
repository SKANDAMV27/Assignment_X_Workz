package com.XWorkz.inheritence.Internal;

public class Charan extends Student{
    public Charan()
    {
        super();
        System.out.println("No args Charan D Student Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Charan D ");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch AIML");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21AI018");
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
