package com.sqc.test.demo1;

import java.util.Observable;

public class Beauty extends Observable {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers(msg);
    }
}
