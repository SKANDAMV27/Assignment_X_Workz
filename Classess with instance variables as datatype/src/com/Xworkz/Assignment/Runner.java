package com.Xworkz.Assignment;

public class Runner {
    public static void main(String[] args)
    {
        Clip clip = new Clip();
        Pushpa pushpa = new Pushpa(clip);
        Clip clip1=new Clip();
        Clip clip2=new Clip();
        Clip clip3=new Clip();
        Clip clip4=new Clip();
        Clip clip5=new Clip();
        Clip[] clips={clip1,clip2,clip3,clip4,clip5};
        pushpa.useClip(clips);
        Rubber rubber = new Rubber();
        Rubber rubber1 = new Rubber();
        Rubber rubber2 = new Rubber();
        Rubber rubber3 = new Rubber();
        Rubber rubber4 = new Rubber();
        Rubber[] rubbers = {rubber1,rubber2,rubber3,rubber4};
        Swetha swetha = new Swetha(rubber);
        swetha.useRubber(rubbers);
        Ticket ticket = new Ticket();
        Cricket cricket = new Cricket(ticket);
        ticket.buy();
        Profit profit = new Profit(ticket);
        ticket.sell();






    }

}
