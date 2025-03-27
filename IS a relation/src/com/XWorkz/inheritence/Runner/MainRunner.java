package com.XWorkz.inheritence.Runner;

import com.XWorkz.inheritence.Internal.Bikes;
import com.XWorkz.inheritence.Internal.Car;
import com.XWorkz.inheritence.Internal.Vehicles;

public class MainRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.Buy();
        car.Move();
        car.Stop();
        car.Sell();
        car.Start();
        Bikes bikes = new Bikes();
        bikes.Buy();
        bikes.Sell();
        bikes.Move();
        bikes.Stop();
        bikes.Start();



    }

}
