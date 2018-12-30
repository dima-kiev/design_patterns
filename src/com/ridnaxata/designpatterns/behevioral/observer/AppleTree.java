package com.ridnaxata.designpatterns.behevioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AppleTree implements Observable<KidObserver> {

    private List<Observer> children = new ArrayList<>();

    @Override
    public void addObserver(KidObserver kid) {
        System.out.println("New kid noticed this tree " + kid.getName());  // kid.getName() - that`s why we need KidObserver extends Observer
        children.add(kid);
    }

    private int applesReady = 0;

    void growApples(int readyToEatApples) {
        System.out.println("\nthere are " + readyToEatApples + " growed on the tree");
        applesReady = applesReady + readyToEatApples;
        children.forEach(kid -> kid.notify(this));
    }

    Integer getOneApple() {
        if (applesReady > 0) {
            applesReady--;
            return 1;
        } else {
            return 0;
        }
    }

}
