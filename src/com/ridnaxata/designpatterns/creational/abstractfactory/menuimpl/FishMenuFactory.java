package com.ridnaxata.designpatterns.creational.abstractfactory.menuimpl;

import com.ridnaxata.designpatterns.creational.abstractfactory.Dish;
import com.ridnaxata.designpatterns.creational.abstractfactory.Drink;
import com.ridnaxata.designpatterns.creational.abstractfactory.MenuFactory;
import com.ridnaxata.designpatterns.creational.abstractfactory.menuitemsimpl.Fish;
import com.ridnaxata.designpatterns.creational.abstractfactory.menuitemsimpl.WhiteWine;

public class FishMenuFactory implements MenuFactory {

    @Override
    public Dish getDish() {
        return new Fish();
    }

    @Override
    public Drink getDrink() {
        return new WhiteWine();
    }
}
