package com.Xworkz.Internal.Serlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/RCB",loadOnStartup = 1)
public class RCB extends GenericServlet {
    public RCB(){
        System.out.println("RCB created by tomcat............");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Overidede...............");

    }
}
