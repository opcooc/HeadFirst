package com.sqc.test.demo;

/**
 * 观察者丑男
 */
public class Ugly implements Observer{

    private Subject subject;

    public Ugly(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Object obj) {
        System.out.print("丑男看见美女"+obj);
    }
}
