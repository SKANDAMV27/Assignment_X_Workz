package com.Xworkz.Assignment;

public class Profit {
    Ticket ticket;
    Profit(Ticket ticket){
        this.ticket=ticket;
    }
    void profit(Ticket ticket){
        if(ticket!=null)
        {
            ticket.sell();
        }else{
            System.out.println("Null Value");
        }

    }
}
