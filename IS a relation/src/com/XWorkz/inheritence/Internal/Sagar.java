package com.XWorkz.inheritence.Internal;

public class Sagar extends Student{
    public Sagar()
    {
        super();
        System.out.println("No args as Sagar Student Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Sagar D");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch CSE");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4MC21CS100");
    }
    @Override
    public void college()
    {
        System.out.println("Student College Malnad Hasan");
    }
    @Override
    public void year()
    {
        System.out.println("Students Admission Year 2021");
    }
}
