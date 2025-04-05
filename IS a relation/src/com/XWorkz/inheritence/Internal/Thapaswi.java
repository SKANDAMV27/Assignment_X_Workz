package com.XWorkz.inheritence.Internal;

public class Thapaswi extends Student{
    public Thapaswi()
    {
        super();
        System.out.println("No args Thapaswi Student Constructor");
    }
    @Override
        public void studentName()
    {
        System.out.println("Student Name Thapaswi");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch Civil");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21CV045");
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
