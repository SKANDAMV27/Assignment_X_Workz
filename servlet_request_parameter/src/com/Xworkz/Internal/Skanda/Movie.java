package com.Xworkz.Internal.Skanda;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/Movie",loadOnStartup = 1)
public class Movie extends GenericServlet {
    public Movie(){
        System.out.println("Movie Created by Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Sevice Runner");
        String movie1=servletRequest.getParameter("name");
        System.out.println(movie1);
        String movie2 = servletRequest.getParameter("hero");
        System.out.println(movie2);
        String movie3 = servletRequest.getParameter("location");
        System.out.println(movie3);
        String movie4 = servletRequest.getParameter("heroin");
        System.out.println("Heroin: "+movie4);
        int movie5 = Integer.parseInt(servletRequest.getParameter("rating"));
        System.out.println("Rating: "+movie5);

    }
}
