package com.sqc.test.demo1;

import java.util.Observable;
import java.util.Observer;

public class Handsome implements Observer {

    public void setHandsome(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Beauty beauty = (Beauty) o;
        System.out.print("帅哥看见美女"+ beauty.getMsg());
    }
}
