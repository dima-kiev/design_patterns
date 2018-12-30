package com.ridnaxata.designpatterns.behevioral.observer;

public class Kid implements KidObserver<AppleTree> {

    private String name;

    public Kid(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notify(AppleTree eventTarget) {
        System.out.println(name + ": I get " + eventTarget.getOneApple() + " apples!");
    }
}
