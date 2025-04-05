package com.XWorkz.inheritence;

public class Colour extends Orange {
    public Colour()
    {
        super();
        System.out.println("no args Orange Colour");
    }
    @Override
    public void dark()
    {
        System.out.println("Dark Color:::::");
    }
    @Override
    public void light()
    {
        System.out.println("Light Color....");
    }
    @Override
    public void simple()
    {
        System.out.println("Simple Color...");
    }
    @Override
    public void no()
    {
        System.out.println("No Color..");
    }
    @Override
    public void more()
    {
        System.out.println("More Color.");
    }

}
