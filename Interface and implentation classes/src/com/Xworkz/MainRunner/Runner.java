package com.Xworkz.MainRunner;

import com.Xworkz.External.*;
import com.Xworkz.Internal.*;

public class Runner {
    public static void main(String[] args) {
        Aakhil aakhil = new aakhilRulls();
        aakhil.collegeRulls();
        aakhil.homeRulls();
        aakhil.schoolRulls();

        System.out.println("");

        Student1 student1 = new Student1Rulls();
        student1.examRulls();
        student1.gameRulls();
        student1.schoolRulls();

        System.out.println("");

        Traffic traffic = new TrafficRulls();
        traffic.signalRulls();
        traffic.drivingRulls();
        traffic.parkingRulls();

        System.out.println("");

        Student2 student2 = new Student2Rulls();
        student2.examRulls();
        student2.gameRulls();
        student2.schoolRulls();

        System.out.println("");

        Student3 student3 = new Student3Rulls();
        student3.presidentRulls();
        student3.principalRulls();
        student3.teacherRulls();



    }
}
