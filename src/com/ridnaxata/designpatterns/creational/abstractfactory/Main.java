package com.ridnaxata.designpatterns.creational.abstractfactory;

import com.ridnaxata.designpatterns.creational.abstractfactory.menuimpl.BeerMenuFactory;
import com.ridnaxata.designpatterns.creational.abstractfactory.menuimpl.FishMenuFactory;
import com.ridnaxata.designpatterns.creational.abstractfactory.menuimpl.MeetMenuFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant;

        Scanner sc = new Scanner(System.in);
        System.out.println("Honey! we are going to restaurant today. Do you like meet (1) or fish (2)? ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                restaurant = new Restaurant(new MeetMenuFactory());
                break;
            case 2:
                restaurant = new Restaurant(new FishMenuFactory());
                break;
            default:
                restaurant = new Restaurant(new BeerMenuFactory());
                break;
        }

        restaurant.showMenu();


    }

}
