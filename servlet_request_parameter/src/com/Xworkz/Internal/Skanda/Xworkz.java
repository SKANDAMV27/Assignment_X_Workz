package com.Xworkz.Internal.Skanda;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/xworkz", loadOnStartup = 1)
public class Xworkz extends GenericServlet {
    public Xworkz(){
        System.out.println("Xworkzz constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Sever Running....");
        System.out.println();
        String xworkz1=servletRequest.getParameter("Founder");
        System.out.println("X-Workz Founder: "+xworkz1);
        System.out.println();
        String xworkz2 = servletRequest.getParameter("location");
        System.out.println("X-Workz Location: "+xworkz2);
        System.out.println();
        String xworkz3 = servletRequest.getParameter("Hr");
        System.out.println("X-Workz HR: "+xworkz3);
        System.out.println();
        String xworkz4 = servletRequest.getParameter("Trainner1");
        System.out.println("Trainner Name: "+xworkz4);
        System.out.println();
        String xworkz5= servletRequest.getParameter("Trainner");
        System.out.println("Trainner Name: "+xworkz5);
        System.out.println();
        String xworkz6 = servletRequest.getParameter("Trainner3");
        System.out.println("Trainner Name: "+xworkz6);
        System.out.println();
        String xworkz7 = servletRequest.getParameter("course");
        System.out.println("Course: "+xworkz7);
        System.out.println();
        System.out.println("<3 END <3");
    }
}
