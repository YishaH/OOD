package org.example.payment;

import org.example.Item;
import org.example.PayResponse;
import org.example.PayStatus;

public class CashPay implements Payment{
    @Override
    public PayResponse pay(Item item, double amount) {
        if (amount < item.getPrice()) {
            returnMoney(amount);
            return new PayResponse(PayStatus.FAIL, "INSUFFICIENT MONEY");
        }
        if (amount > item.getPrice()) {
            giveChange(amount - item.getPrice());
        }
        return new PayResponse(PayStatus.SUCCESS, null);
    }

    private void giveChange(double changeAmount) {
        System.out.println("Here is your change of " + changeAmount);
    }

    public void returnMoney(double returnAmount) {
        System.out.println("Here is your returned money of: " + returnAmount);
    }
}
