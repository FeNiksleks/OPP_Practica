package com.company;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Product> shopList;

    public Basket() {
        shopList = new ArrayList<Product>();
    }

    public void addProduct(Product item) {
        shopList.add(item);
    }

    public void removeProduct(Product item) {
        shopList.remove(item);
    }

    public String getShoppingList() {
        StringBuilder shoppingList = new StringBuilder();
        for (int i = 0; i < shopList.size(); i++) {
            shoppingList.append(shopList.get(i).name).append(" ");
        }
        return shoppingList.toString();
    }
}


