package com.company;

public class User {
    String login;
    String password;
    Basket userBasket;

    public User() {
        this.login = "Unknown login";
        this.password = "qwerty";
    }

    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setBasket(Basket basket) {
        this.userBasket = basket;
        return this;
    }

    public void getUserBusket() {
        System.out.println(String.format("username: %s,\n user's shopping list: %s",
                this.login, userBasket.getShoppingList()));
    }
}


