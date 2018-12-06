package com.ridnaxata.designpatterns.creational.abstractfactory.menuimpl;

import com.ridnaxata.designpatterns.creational.abstractfactory.Dish;
import com.ridnaxata.designpatterns.creational.abstractfactory.Drink;
import com.ridnaxata.designpatterns.creational.abstractfactory.MenuFactory;
import com.ridnaxata.designpatterns.creational.abstractfactory.menuitemsimpl.Beer;
import com.ridnaxata.designpatterns.creational.abstractfactory.menuitemsimpl.RoastedNuts;

public class BeerMenuFactory implements MenuFactory {

    @Override
    public Dish getDish() {
        return new RoastedNuts();
    }

    @Override
    public Drink getDrink() {
        return new Beer();
    }
}
