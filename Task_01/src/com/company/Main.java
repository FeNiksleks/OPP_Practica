package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void showAllProducts(Category[] allCategories) {
        // метод для того, чтобы показать весь ассортимент магазина по категориям
        for (int i = 0; i < allCategories.length; i++) {
            System.out.println(String.format("Category: %s\n List of products:", allCategories[i].name,
                    allCategories[i].getCategoryList()));
        }
    }

    public static void main(String[] args) {
        /* массив allCategories - двумерный и каждый элемент может быть разной длины(ступенька),
        т.к каждая категория является массивом продуктов */
        final List<Category> allCategories = new ArrayList<Category>(); // почему тут public(etc) нельзя использовать

        Category milk = new Category().setName("milk");
        Category meat = new Category().setName("meat");
        Category sweets = new Category().setName("sweets");

        Basket milkaBasket = new Basket();

        User Kurkuma = new User().setLogin("kukuruma");
        User Kirito = new User().setLogin("saoLover").setPassword("h_haruka");
        User Milka = new User().setLogin("podoMilka").setPassword("the best flovor").setBasket(milkaBasket);
        Milka.getUserBusket();
    }
}


