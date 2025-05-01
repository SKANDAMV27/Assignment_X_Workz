package com.Xworkz.Internal.Skanda;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.sound.midi.Soundbank;
import java.io.IOException;

@WebServlet(urlPatterns = "/Hotel",loadOnStartup = 1)
public class Hotel extends GenericServlet {
    public Hotel(){
        System.out.println("Hotel is Devepled by Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Sevice Runner");
        String hotel1 = servletRequest.getParameter("name");
        System.out.println("Hotel Name: "+hotel1);
        System.out.println("");
        String hotel2 = servletRequest.getParameter("Location");
        System.out.println("Hotel Location: "+hotel2);
        System.out.println();
        String hotel3 = servletRequest.getParameter("type");
        System.out.println("Hotel Type :"+hotel3);
        System.out.println();
        String hotel4 = servletRequest.getParameter("Ratting");
        System.out.println(hotel4);
        System.out.println();
        String hotel5 = servletRequest.getParameter("onwer_name");
        System.out.println("Owner Name: "+hotel5);
        System.out.println();
        String hotel6 = servletRequest.getParameter("casher_name");
        System.out.println("casher Name:"+hotel6);
        System.out.println();
        String hotel7 = servletRequest.getParameter("shuff_name");
        System.out.println("Shuff Name: "+hotel7);
        System.out.println();
        System.out.println("End");
    }
}
