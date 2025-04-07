package com.XworkZ;

public class ColorDetails {
    public void details(Orange orange)
    {
        orange.dark();
        orange.light();
        orange.no();
        orange.more();
        orange.simple();
        if(orange instanceof Color)
        {
            Color color =(Color) orange;
            orange.simple();
        }
    }
}
