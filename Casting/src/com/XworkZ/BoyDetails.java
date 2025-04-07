package com.XworkZ;

public class BoyDetails {
    public void details(Boy boy)
    {
        boy.color();
        boy.height();
        boy.name();
        boy.weight();
        boy.size();
        if(boy instanceof HumanBeing)
        {
            HumanBeing humanBeing =(HumanBeing) boy;
            humanBeing.color();
        }
    }
}
