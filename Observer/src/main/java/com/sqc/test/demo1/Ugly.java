package com.sqc.test.demo1;


import java.util.Observable;
import java.util.Observer;

public class Ugly implements Observer {

    public void setUgly(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Beauty beauty = (Beauty) o;
        System.out.print("丑男看见美女" + beauty.getMsg());
    }
}
