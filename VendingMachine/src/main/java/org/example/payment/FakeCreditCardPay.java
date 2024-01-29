package org.example.payment;

public class FakeCreditCardPay extends CreditCardPay{
    @Override
    public boolean chargeWithRealBank(String creditCardNumber, double purchaseAmount) {
        if (creditCardNumber.equals("1234")) {
            return true;
        }
        return false;
    }

    @Override
    public String getCreditCardNumber() {
        return "1234";
    }
}
