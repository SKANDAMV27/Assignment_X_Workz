package com.XWorkz.ass2;

public class Runner {
    public static void main(String[] args)
    {
        IdCard idCard = new IdCard();
        Jail jail1 = new Jail();
        jail1.setName("Skanda M V");
        jail1.setLocation("Thirthahalli");
        jail1.setJailerName("ABHI S V");
        jail1.setTotalCells(45);
        Jail jail2 = new Jail();
        jail2.setName("Dhanush");
        jail2.setLocation("Koppa");
        jail2.setJailerName("Vekkappa");
        jail2.setTotalCells(78);
        Jail[] jails ={jail1,jail2};
        idCard.showId(jails);

            }
        }


