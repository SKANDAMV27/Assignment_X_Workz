package com.XWorkz.inheritence.Internal;

public class Shriharsha extends Student{
    public Shriharsha()
    {
        super();
        System.out.println("No Args as Shriharsha Student Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Shriharsha K M");
    }@Override
    public void branch()
    {
        System.out.println("Student Branch CSE");
    }@Override
    public void USN()
    {
        System.out.println("Student USN 4SD21CS107");
    }@Override
    public void college()
    {
        System.out.println("Student College Shri Devi");
    }
    @Override
    public void year()
    {
        System.out.println("Students Admission Year 2021");
    }
}
