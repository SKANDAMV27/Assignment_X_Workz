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
    public String toString() {
        return "Memory{" +
                "storage=" + storage +
                ", type='" + type + '\'' +
                ", grade=" + grade +
                '}';
    }
}
