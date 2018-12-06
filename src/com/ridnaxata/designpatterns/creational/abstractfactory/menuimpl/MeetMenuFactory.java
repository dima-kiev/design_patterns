package com.ridnaxata.designpatterns.creational.abstractfactory.menuimpl;

import com.ridnaxata.designpatterns.creational.abstractfactory.Dish;
import com.ridnaxata.designpatterns.creational.abstractfactory.Drink;
import com.ridnaxata.designpatterns.creational.abstractfactory.MenuFactory;
import com.ridnaxata.designpatterns.creational.abstractfactory.menuitemsimpl.Meet;
import com.ridnaxata.designpatterns.creational.abstractfactory.menuitemsimpl.RedWine;

public class MeetMenuFactory implements MenuFactory {

    @Override
    public Dish getDish() {
        return new Meet();
    }

    @Override
    public Drink getDrink() {
        return new RedWine();
    }

}
