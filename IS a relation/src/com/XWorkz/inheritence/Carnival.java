package com.XWorkz.inheritence;

public class Carnival extends Festival{
    public Carnival(){
        super();
        System.out.println("no args Carnival");
    }

    @Override
    public void diwali() {
        System.out.println("diwali Fistival");
    }

    @Override
    public void ganeshaChathurthi() {
        System.out.println("Festival Name is Ganesha Chathurthi");
    }

    @Override
    public void ramzan() {
        System.out.println("Festival Name is Ramzan");
    }

    @Override
    public void ugadi() {
        System.out.println("Festival Name is Ugadi");
    }

    @Override
    public void Holi() {
        System.out.println("Festival Name is Holi");
    }
}
