package org.example;

import org.example.payment.Payment;

import java.util.HashMap;
import java.util.List;

public class VendingMachine {
    private HashMap<String, List<Item>> itemMap;

    public VendingMachine(HashMap<String, List<Item>> itemMap) {
        this.itemMap = itemMap;
    }

    public void pay(String code, double amount, Payment payment) {
        Item item = getItem(code);
        PayResponse payResponse;
        if (item == null) {
            payResponse = new PayResponse(PayStatus.FAIL, "OUT OF STORAGE");
        } else {
            payResponse = payment.pay(item, amount);
        }

        if (payResponse.status == PayStatus.SUCCESS) {
            System.out.println("Purchase Success!");
            deliverItem(code);
        } else {
            System.out.println("Purchase Fail!");
            System.out.println(payResponse.errorMsg);
        }
    }

    public Item getItem(String code) {
        List<Item> itemList = itemMap.get(code);
        if (itemList == null || itemList.size() == 0) {
            return null;
        }
        return itemList.get(itemList.size() - 1);
    }
    public void deliverItem(String code) {
        System.out.println("grasp purchased item");
        List<Item> itemList = itemMap.get(code);
        itemList.remove(itemList.size() - 1);
    }
}
