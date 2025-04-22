package com.Xworkz.MainRunner;

import com.Xworkz.Internal.*;
import com.Xworkz.User.*;
import com.Xworkz.implem.*;

public class Runner {
    public static void main(String[] args) {
        ICCC iccc = new IndianCricketTeamIccImpl();
        BCCI bcci = new BCCI(iccc);
        bcci.Team();

        System.out.println("");
        Consitution consitution = new CitizenConstituionImpl();
        Government government = new Government(consitution);
        government.Vote();

        System.out.println(".........");
        Laptop laptop = new LaptopImpl();
        OperatingSystem operatingSystem = new OperatingSystem(laptop);
        operatingSystem.Ryzen();

        System.out.println("");
        Vehicles vehicles = new VehiclesImpl();
        VehiclesUser vehiclesUser = new VehiclesUser(vehicles);
        vehiclesUser.sell();

        System.out.println("");
        BankAccount bankAccount = new BankAccountImpl();
        AccountUser accountUser = new AccountUser(bankAccount);
        accountUser.crediate();

        System.out.println("");
        Hospital hospital = new HostipaImp();
        HospitalUser hospitalUser = new HospitalUser(hospital);
        hospitalUser.doctor();

        System.out.println("");
        Car car = new CarImp();
        CarUser carUser = new CarUser(car);
        carUser.buy();

        System.out.println("");
        Bike bike = new BikeImp();
        BikeUser bikeUser = new BikeUser(bike);
        bikeUser.sell();

        System.out.println("");
        Bus bus = new BusImp();
        BusUser busUser = new BusUser(bus);
        busUser.line();

        System.out.println("");
        JCB jcb = new JCBIMP();
        JCBUser jcbUser = new JCBUser(jcb);
        jcbUser.time();

        System.out.println("");
        Train train = new TrainImp();
        TrainUser trainUser = new TrainUser(train);
        trainUser.deparch();

        System.out.println("");
        Mobile mobile = new MobileImp();
        MobileUser mobileUser = new MobileUser(mobile);
        mobileUser.Andriod();

        System.out.println("");
        Building building = new BuildingImp();
        BuildingUser buildingUser = new BuildingUser(building);
        buildingUser.base();

        System.out.println("");
        School school=new SchoolImpl();
        SchoolUser schoolUser=new SchoolUser(school);
        schoolUser.teacher();

        System.out.println("");
        College college = new CollegeImpl();
        CollegeUser collegeUser = new CollegeUser(college);
        collegeUser.branch();

        System.out.println("");
        Aakhil aakhil = new AakhilIml();
        AakhilUser aakhilUser = new AakhilUser(aakhil);
        aakhilUser.person();

        System.out.println("");
        Abhi abhi = new AbhiImp();
        AbhiUser abhiUser = new AbhiUser(abhi);
        abhiUser.person();

        System.out.println("");






    }
}
