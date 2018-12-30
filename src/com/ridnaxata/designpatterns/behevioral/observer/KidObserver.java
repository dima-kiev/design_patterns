package com.ridnaxata.designpatterns.behevioral.observer;

public interface KidObserver<T extends AppleTree> extends Observer<T> {

    String getName();

}
