package org.example.payment;

import org.example.Item;
import org.example.PayResponse;

public interface Payment {
    abstract PayResponse pay(Item item, double amount);
}
