package com.Xworkz.Internal.Skanda;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/fule",loadOnStartup = 1)
public class FuelStation extends GenericServlet {
    public FuelStation(){
        System.out.println("Fule Station is Made by Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service Running");
        System.out.println("Fule Station List In Thirthahalli");
        String petrol1 = servletRequest.getParameter("station1");
        System.out.println("Station 1: "+petrol1);
        String petrol2 = servletRequest.getParameter("station2");
        System.out.println("Station 2: "+petrol2);
        String petrol3 = servletRequest.getParameter("station3");
        System.out.println("Station 3: "+petrol3);
        String petrol4 = servletRequest.getParameter("station4");
        System.out.println("Station 4: "+petrol4);
        String petrol5 = servletRequest.getParameter("station5");
        System.out.println("Station 5: "+petrol5);
        String petrol6 = servletRequest.getParameter("station6");
        System.out.println("Station 6: "+petrol6);
        String petrol7 = servletRequest.getParameter("station7");
        System.out.println("Station 7: "+petrol7);
        String petrol8 = servletRequest.getParameter("station8");
        System.out.println("Station 8: "+petrol8);
        String petrol9 = servletRequest.getParameter("station9");
        System.out.println("Station 9: "+petrol9);
        System.out.println("......................................");
    }
}
