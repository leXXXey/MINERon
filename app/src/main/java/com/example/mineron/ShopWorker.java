package com.example.mineron;

import java.io.Serializable;

public class ShopWorker implements Serializable {
    long id;
    String level, price;

    public ShopWorker(long id, String level, String price) {
        this.id = id;
        this.level = level;
        this.price = price;
    }


    public long getId() {
        return id;
    }

    public String getLevel() {
        return level;
    }

    public String getPrice() {
        return price;
    }
}
