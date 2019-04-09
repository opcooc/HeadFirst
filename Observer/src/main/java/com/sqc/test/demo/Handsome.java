package com.sqc.test.demo;

/**
 * 观察者帅哥
 */
public class Handsome implements Observer{

    private Subject subject;

    public Handsome(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Object obj) {
        System.out.print("帅哥看见美女"+obj);
    }
}
