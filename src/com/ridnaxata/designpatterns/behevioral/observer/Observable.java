package com.ridnaxata.designpatterns.behevioral.observer;

public interface Observable<E extends Observer> {

    void addObserver(E observer);

}
