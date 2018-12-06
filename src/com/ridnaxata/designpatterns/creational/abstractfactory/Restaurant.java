package com.ridnaxata.designpatterns.creational.abstractfactory;

public class Restaurant {

    private Dish dish;
    private Drink drink;

    private MenuFactory factory;

    public Restaurant(MenuFactory factory) {
        this.factory = factory;
    }

    private void obtainMenu() {
        dish = factory.getDish();
        drink = factory.getDrink();
    }

    public void showMenu() {

        obtainMenu();

        System.out.println("Welcome to our Restaurant! Today in our menu: ");
        System.out.println("main dish: " + dish.getName());
        System.out.println("recommended drink for main dish is: " + drink.getName());

    }
}
