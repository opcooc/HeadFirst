package com.sqc.test.demo;

public interface Subject {

    /**
     * 添加观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     *
     * @param observer
     */
    void notifyObserver();

}
