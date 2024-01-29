package org.example;

import org.example.payment.CashPay;
import org.example.payment.CoinPay;
import org.example.payment.CreditCardPay;
import org.example.payment.FakeCreditCardPay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Build a Vending Machine
        HashMap<String, List<Item>> itemMap = new HashMap<>();
        List<Item> listA1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Item item = new Item(Integer.toString(i + 1000), "Hershey", 3, ItemType.Chocolate);
            listA1.add(item);
        }
        itemMap.put("A1", listA1);

        List<Item> listA2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Item item = new Item(Integer.toString(i + 2000), "Oreo", 10, ItemType.Cookie);
            listA2.add(item);
        }
        itemMap.put("A2", listA2);

        List<Item> listA3 = new ArrayList<>();
        itemMap.put("A3", listA3);

        VendingMachine vendingMachine = new VendingMachine(itemMap);

        // Purchase Test
        // Purchase 1
        System.out.println("Transaction1: ");
        vendingMachine.pay("A1", 5, new CashPay());
        System.out.println("");
        // Purchase 2
        System.out.println("Transaction2: ");
        vendingMachine.pay("A2", 5, new CashPay());
        System.out.println("");
        // Purchase 3
        System.out.println("Transaction3: ");
        vendingMachine.pay("A3", 5, new CashPay());
        System.out.println("");
        // Purchase 4
        System.out.println("Transaction4: ");
        vendingMachine.pay("A1", 5, new CreditCardPay());
        System.out.println("");
        // Purchase 5
        System.out.println("Transaction5: ");
        vendingMachine.pay("A1", 5, new FakeCreditCardPay());
        System.out.println("");
        // Purchase 6
        System.out.println("Transaction6: ");
        vendingMachine.pay("A1", 5, new CreditCardPay());
        System.out.println("");
    }
}