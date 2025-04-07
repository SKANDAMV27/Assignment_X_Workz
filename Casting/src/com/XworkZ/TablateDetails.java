package com.XworkZ;

public class TablateDetails {
    public void details(Tablate tablate)
    {
        tablate.Note();
        tablate.number();
        tablate.page();
        tablate.test();
        tablate.type();
        if(tablate instanceof Medican)
        {
            Medican medican = (Medican) tablate;
            medican.Price();
        }
    }
}
