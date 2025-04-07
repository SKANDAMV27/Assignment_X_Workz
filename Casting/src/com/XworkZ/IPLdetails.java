package com.XworkZ;

public class IPLdetails {
    public void details(IPL ipl)
    {
        ipl.captanName();
        ipl.loss();
        ipl.color();
        ipl.win();
        ipl.score();
        if(ipl instanceof RCB)
        {
            RCB rcb =(RCB) ipl;
            rcb.team();
        }
    }
}
