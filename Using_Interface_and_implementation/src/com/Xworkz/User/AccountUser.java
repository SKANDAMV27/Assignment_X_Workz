package com.Xworkz.User;

import com.Xworkz.Internal.BankAccount;

public class AccountUser {
    public BankAccount bankAccount;
    public AccountUser(BankAccount bankAccount){
        this.bankAccount=bankAccount;
        System.out.println("Account USer Constructor");
    }
    public void crediate(){
        if(this.bankAccount!=null){
            this.bankAccount.Account();
            System.out.println("Crediate the Amount");
        }
        else {
            System.out.println("Null Value");
        }
    }
}
