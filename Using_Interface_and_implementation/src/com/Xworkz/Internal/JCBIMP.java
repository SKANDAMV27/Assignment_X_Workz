package com.Xworkz.implem;

import com.Xworkz.Internal.JCB;

public class JCBIMP implements JCB {
    public JCBIMP(){
        System.out.println("No args JCBIMP Constructor");
    }

    @Override
    public void work() {
        System.out.println("Jcb");
    }
}
