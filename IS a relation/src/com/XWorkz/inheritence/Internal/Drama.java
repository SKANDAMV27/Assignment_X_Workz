package com.XWorkz.inheritence.Internal;

public class Drama extends Movie{
    public Drama(){
        super();
        System.out.println("No args Drama Movie Constructor");
    }
    @Override
    public void movieName()
    {
        System.out.println("Movie Name Drama");
    }
    @Override
    public void heroName()
    {
        System.out.println("Hero Name Yash");
    }
    @Override
    public void heroinName()
    {
        System.out.println("Heroin Name Radike");
    }
    @Override
    public void rating()
    {
        System.out.println("Movie Rating 4.5");
    }
}
