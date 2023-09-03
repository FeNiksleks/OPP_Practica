package com.company;

import java.util.ArrayList;
import java.util.List;

public class Category {
    String name;

    private final List<Product> products;

    public Category() {
        products = new ArrayList<Product>();
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public void addProductToCategory(Product item) {
        products.add(item);
    }

    public void removeProductFromCategory(Product item) {
        products.remove(item);
    }

    public String getCategoryList() {
        StringBuilder categoryList = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            categoryList.append(products.get(i).name).append(" ");
        }
        return categoryList.toString();
    }
}


