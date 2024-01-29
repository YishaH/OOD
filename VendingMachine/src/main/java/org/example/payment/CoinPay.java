package org.example.payment;

import org.example.Item;
import org.example.PayResponse;
import org.example.PayStatus;

public class CoinPay implements Payment{
    @Override
    public PayResponse pay(Item item, double amount) {
        if (amount < item.getPrice()) {
            returnMoney(amount);
            return new PayResponse(PayStatus.FAIL, "INSUFFICIENT MONEY");
        }
        return new PayResponse(PayStatus.SUCCESS, null);
    }
    public void returnMoney(double returnAmount) {
        System.out.println("Here is your returned money of: " + returnAmount);
    }
}
