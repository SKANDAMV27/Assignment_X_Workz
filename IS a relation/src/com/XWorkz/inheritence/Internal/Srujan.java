package com.XWorkz.inheritence.Internal;

public class Srujan extends Student{
    public Srujan(){
        super();
        System.out.println("No args Srujan Student Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Srujan S");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch CSE");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4MI21CS018");
    }
    @Override
    public void college()
    {
        System.out.println("Student College MITE ");
    }
    @Override
    public void year()
    {
        System.out.println("Students Admission Year 2021");
    }
}
