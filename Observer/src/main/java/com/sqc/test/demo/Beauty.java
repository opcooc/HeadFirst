package com.sqc.test.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察这美女
 */
public class Beauty implements Subject{

    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserver();
    }

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if( index >=0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach( observer -> observer.update(msg));
    }
}
