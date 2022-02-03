package com.gomezpascual.exerciseTwo;

import java.util.ArrayList;
import java.util.List;

public class ProductThree extends Product {

    //Subscription list. Static to have only one instance of list per product
    private static List<ProductObserver> observers = new ArrayList<>();

    ProductThree() {
        super("Product Three", 25);
    }

    public void addObserver(ProductObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ProductObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(o->o.updated(this));
    }

    public static void getSubsList() {
        System.out.print("[");
        for (ProductObserver observer: observers) {
            System.out.print("Subs, ");
        }
        System.out.println("]");
    }
}
