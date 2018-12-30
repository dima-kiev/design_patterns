package com.ridnaxata.designpatterns.behevioral.observer;

public class Main {

    public static void main(String[] args) {

        AppleTree tree = new AppleTree();

        tree.addObserver(new Kid("Vladimir"));
        tree.addObserver(new Kid("Vlada"));
        tree.addObserver(new Kid("Slavik"));

        tree.growApples(5);

        tree.growApples(2);

        tree.addObserver(new Kid("Yarik"));
        tree.addObserver(new Kid("Yevdokia"));

        tree.growApples(2);

        tree.growApples(20);

    }

}
