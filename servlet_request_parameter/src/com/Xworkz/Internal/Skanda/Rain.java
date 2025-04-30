package com.Xworkz.Internal.Skanda;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Rain",loadOnStartup = 1)
public class Rain extends GenericServlet {

    public Rain(){
        System.out.println("No args Rain Constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service");
        String rain1 = servletRequest.getParameter("name");
        System.out.println(rain1);
        int rain2 = Integer.parseInt(servletRequest.getParameter("number"));
        System.out.println(rain2);
        String rain3 = servletRequest.getParameter("state");
        System.out.println(rain3);
        String rain4 = servletRequest.getParameter("people");
        System.out.println(rain4);

    }
}
