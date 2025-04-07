package com.XworkZ;

public class CarDeal {
    public void deal(Vehicle vehicle)
    {
        vehicle.buy();
        vehicle.move();
        vehicle.sell();
        vehicle.speed();
        vehicle.price();
        if(vehicle instanceof Car)
        {
            Car car =(Car)vehicle;
            car.Milage();
        }
    }
}
