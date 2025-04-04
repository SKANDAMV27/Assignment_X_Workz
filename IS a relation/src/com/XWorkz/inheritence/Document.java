package com.XWorkz.inheritence;

public class Document extends Report {
    public Document()
    {
        super();
        System.out.println("No-args of Documnets Constructor");
    }
    @Override
    public void introduction()
    {
        System.out.println("Introduction of the Document.");
    }
    @Override
    public void flowChart()
    {
        System.out.println("Document Flow Chart");
    }
    @Override
    public void systemDesign()
    {
        System.out.println("System Design For Document.");
    }
    @Override
    public void result()
    {
        System.out.println("Result of Document");
    }
    @Override
    public void conclusion()
    {
        System.out.println("Conslusion for the Document");
    }

}
