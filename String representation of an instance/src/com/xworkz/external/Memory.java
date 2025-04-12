package com.xworkz.external;

import com.xworkz.internal.RAM;

public class Memory extends RAM {
    private int storage;
    private String type;
    private char grade;
    public Memory(int storage,String type,char grade)
    {
        this.grade=grade;
        this.storage=storage;
        this.type=type;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 9009;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("Null");
            if(obj instanceof Memory){
                Memory memory = this;
                Memory memory1 = (Memory) obj;
                if(memory1.type==memory.type && memory1.grade==memory.grade && memory.storage==memory1.grade){
                    System.out.println("Compare :"+(memory1==memory));
                    return false;
                }
            }

        }
        return true;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getType() {
        return type;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "storage=" + storage +
                ", type='" + type + '\'' +
                ", grade=" + grade +
                '}';
    }
}
