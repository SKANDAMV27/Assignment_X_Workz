package com.XWorkz.inheritence;

public class MainRunner {
    public static void main(String[] args) {




        Car car = new Car();
        car.Stop();
        car.Buy();
        car.Move();
        car.Sell();
        car.Start();

        Colour colour = new Colour();
        colour.dark();
        colour.more();
        colour.light();
        colour.simple();
        colour.no();

        Fruit fruit = new Fruit();
        fruit.colour();;
        fruit.kg();
        fruit.price();
        fruit.Size();
        fruit.type();

        Document document = new Document();
        document.introduction();
        document.conclusion();
        document.flowChart();
        document.result();
        document.systemDesign();

        Home home = new Building();
        home.bathRoom();
        home.bedRoom();
        home.hall();
        home.dinningHall();
        home.kitchen();

        Sand sand = new Soil();
        sand.area();
        sand.color();
        sand.quality();
        sand.type();
        sand.quantity();

        Money money = new Amount();
        money.loanAmont();
        money.cash();
        money.intrest();
        money.UIP();
        money.payment();

        Hotel hotel = new Canteen();
        hotel.business();
        hotel.dosa();
        hotel.plate();
        hotel.business();
        hotel.supplear();

        Hostel hostel = new PG();
        hostel.Fees();
        hostel.Food();
        hostel.location();
        hostel.sharing();
        hostel.students();

        Bar bar = new wineShop();
        bar.barLocation();
        bar.area();
        bar.beer();
        bar.brand();
        bar.owner();

        Brand brand = new Counter();
        brand.BP();
        brand.MC();
        brand.Beer();
        brand.MC();
        brand.RS();

        Battery battery = new Torch();
        battery.batterColor();
        battery.batterCost();
        battery.charge();
        battery.Shell();
        battery.singleLight();

        Cow cow = new Animal();
        cow.cowBread();
        cow.cowColour();
        cow.cowName();
        cow.cowPrice();
        cow.cowSize();

        Parrot parrot = new Birds();
        parrot.parrotColor();
        parrot.gender();
        parrot.number();
        parrot.weight();
        parrot.parrotLocation();

        Mobile mobile = new Phone();
        mobile.Mi();
        mobile.call();
        mobile.price();
        mobile.text();
        mobile.types();



    }

}
