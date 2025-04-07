package com.XworkZ;

public class ThirthahalliDetails {
    public void details(Thirthahalli thirthahalli) {
        thirthahalli.area();
        thirthahalli.distance();
        thirthahalli.location();
        thirthahalli.nature();
        thirthahalli.nearPlace();
        if (thirthahalli instanceof Hevan) {
            Hevan hevan = (Hevan) thirthahalli;
            hevan.calture();
        }
    }
}
