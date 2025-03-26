package com.XWorkz.assignments;

public class PersonAssistant {
    String assistantName;
    int assiatantId;
    public void PersonAssistant(String assistantName,int assiatantId){
        this.assistantName=assistantName;
        this.assiatantId=assiatantId;
    }
    void displayPersonAssistant(){
        System.out.println("Personal Assistant Details.");
        System.out.println("Assistant Name: "+assistantName);
        System.out.println("Assistant ID: "+assiatantId);
    }
}
