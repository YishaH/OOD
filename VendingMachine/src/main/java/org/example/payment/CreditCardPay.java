package org.example.payment;

import org.example.Item;
import org.example.PayResponse;
import org.example.PayStatus;

public class CreditCardPay implements Payment{
    @Override
    public PayResponse pay(Item item, double amount) {
        String creditCardNumber = getCreditCardNumber();
        if (chargeWithRealBank(creditCardNumber, item.getPrice())) {
            return new PayResponse(PayStatus.SUCCESS, null);
        }
        return new PayResponse(PayStatus.FAIL, "CREDIT CARD DENIED");
    }

    public boolean chargeWithRealBank(String creditCardNumber, double purchaseAmount) {
        return false;
    }

    public String getCreditCardNumber() {
        return null;
    }
}
