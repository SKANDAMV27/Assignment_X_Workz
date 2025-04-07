package com.XworkZ;

public class MoneyDetails {
    public void Details(Money money)
    {
        money.cash();
        money.intrest();
        money.UIP();
        money.payment();
        money.loanAmont();
        if(money instanceof Amount)
        {
            Amount amount = (Amount) money;
            amount.number();
        }
    }
}
