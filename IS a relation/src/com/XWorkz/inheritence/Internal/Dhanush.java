package com.XWorkz.inheritence.Internal;

public class Dhanush extends Student{
    public Dhanush()
    {
        super();
        System.out.println("No args Dhanush Student Constructore");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Dhanush");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch ISE");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21IS045");
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
