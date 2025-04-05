package com.XWorkz.inheritence.Internal;

public class Pratham extends Student{
    public Pratham(){
        super();
        System.out.println("No args Pratham Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Pratham Francis");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch AIML");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21AI035");
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
