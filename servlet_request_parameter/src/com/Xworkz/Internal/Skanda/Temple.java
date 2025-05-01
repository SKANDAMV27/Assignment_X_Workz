package com.Xworkz.Internal.Skanda;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/temple",loadOnStartup = 1)
public class Temple extends GenericServlet {
    public Temple(){
        System.out.println("Temple Running By Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service Running");
        System.out.println("Temple List");
        String temple1 = servletRequest.getParameter("temple1");
        System.out.println(temple1);
        String temple2 = servletRequest.getParameter("temple2");
        System.out.println(temple2);
        String temple3 = servletRequest.getParameter("temple3");
        System.out.println(temple3);
        String temple4 = servletRequest.getParameter("temple4");
        System.out.println(temple4);
        String temple5 = servletRequest.getParameter("temple5");
        System.out.println(temple5);
        String temple6 = servletRequest.getParameter("temple6");
        System.out.println(temple6);
        String temple7 = servletRequest.getParameter("temple7");
        System.out.println(temple7);
        String temple8 = servletRequest.getParameter("temple8");
        System.out.println(temple8);
        String temple9 = servletRequest.getParameter("temple9");
        System.out.println(temple9);
        String temple10 = servletRequest.getParameter("temple10");
        System.out.println(temple10);
        String temple11 = servletRequest.getParameter("temple11");
        System.out.println(temple11);

    }
}