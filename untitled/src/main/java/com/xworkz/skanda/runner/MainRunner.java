package com.xworkz.skanda.runner;

import com.xworkz.skanda.internal.Bottle;

import java.io.IOException;

public class MainRunner {
    public static void main(String[] args) throws IOException {
        Bottle bottle = new Bottle();
        bottle.readExcel();
    }
}
