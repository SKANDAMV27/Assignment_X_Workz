package com.Xworkz.Internal.cap;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Bisleri" , loadOnStartup = 1)
public class Bisleri extends GenericServlet {
    public String name;
    public Bisleri(){
        System.out.println("Bisleri Constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Predns");
        int age;
        age=45;
        System.out.println("Age: "+age);
    }
    @Override
    public String toString() {
        return "Age: ";
    }
}
