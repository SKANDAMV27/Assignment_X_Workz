package com.Xworkz.Assignment;

public class Cricket {
    Ticket ticket;
    Cricket(Ticket ticket){
        this.ticket=ticket;
    }
    void Watch(Ticket ticket)
    {
        if(ticket!=null){
            ticket.buy();
        }else {
            System.out.println("Null Value");
        }
    }
}
