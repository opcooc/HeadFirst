package com.sqc.test.demo;



public class TestMain {

    public static void main(String[] args) {
        Beauty beauty = new Beauty();
        Observer observer = new Handsome(beauty);
        Observer observer1 = new Ugly(beauty);
        beauty.setMsg("洗澡去了\n");


    }
}
