package com.xworkz.ani.internal;

public class SBICompliantBankImpl implements BankPolicy {
    @Override
    public void fairPlay() {
        System.out.println("SBICompliantBankImpl follows fair play.");
    }
}
