package com.XworkZ;

public class AccontDetails {
    public void details(Accont accont)
    {
        accont.major();
        accont.Hold();
        accont.minor();
        accont.name();
        accont.number();
        if(accont instanceof InstaAccont)
        {
            InstaAccont instaAccont = (InstaAccont)accont;
            instaAccont.type();
        }
    }
}
