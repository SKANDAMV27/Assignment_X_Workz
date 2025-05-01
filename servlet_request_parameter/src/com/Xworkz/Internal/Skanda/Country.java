package com.Xworkz.Internal.Skanda;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/country",loadOnStartup = 1)
public class Country extends GenericServlet {
    public Country(){
        System.out.println("Country is constructed by the Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service Running");
        System.out.println("Country List");
        String country1 = servletRequest.getParameter("country1");
        System.out.println(country1);
        System.out.println("");
        String country2 = servletRequest.getParameter("country2");
        System.out.println(country2);
        System.out.println("");
        String country3 = servletRequest.getParameter("country3");
        System.out.println(country3);
        System.out.println();
        String country4 = servletRequest.getParameter("country4");
        System.out.println(country4);
        System.out.println("");
        String country5 = servletRequest.getParameter("country5");
        System.out.println(country5);
        System.out.println("");
        String country6 = servletRequest.getParameter("country6");
        System.out.println(country6);
        System.out.println("");
        String country7 = servletRequest.getParameter("country7");
        System.out.println(country7);
        System.out.println("");
        String country8 = servletRequest.getParameter("country8");
        System.out.println(country8);
        System.out.println("");
        String country9 = servletRequest.getParameter("country9");
        System.out.println(country9);
        System.out.println("");
        String country10 = servletRequest.getParameter("country10");
        System.out.println(country10);
        System.out.println("");
        String country11 = servletRequest.getParameter("country11");
        System.out.println(country11);
        System.out.println("");
        String country12 = servletRequest.getParameter("country12");
        System.out.println(country12);
        System.out.println();
        String country13 = servletRequest.getParameter("country13");
        System.out.println(country13);
        System.out.println();
        System.out.println(">>>>>>>>>>END<<<<<<<<<<");

    }
}
