package com.XworkZ;

public class TyerDetails {
    public void Details(Tyer tyer)
    {
        tyer.bike();
        tyer.car();
        tyer.grip();
        tyer.tiller();
        tyer.type();
        if(tyer instanceof Wheel)
        {
            Wheel wheel =(Wheel) tyer;
            wheel.company();
        }
    }
}
