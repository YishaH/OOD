package org.example;

public class PayResponse {
    public PayStatus status;
    public String errorMsg;

    public PayResponse(PayStatus status, String errorMsg) {
        this.status = status;
        this.errorMsg = errorMsg;
    }
}

