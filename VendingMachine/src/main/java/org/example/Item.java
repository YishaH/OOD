package org.example;

public class Item {
    private String id;
    private String name;
    private double price;
    private ItemType type;
    public Item(String id, String name, double price, ItemType type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public double getPrice() {
        return price;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

enum ItemType {
    Cookie, Chocolate, Chip, Water
}
