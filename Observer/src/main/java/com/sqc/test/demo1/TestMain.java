package com.sqc.test.demo1;



public class TestMain {

    public static void main(String[] args) {
        Beauty beauty = new Beauty();
        Handsome handsome = new Handsome();
        Ugly ugly = new Ugly();
        ugly.setUgly(beauty);
        handsome.setHandsome(beauty);
        beauty.setMsg("洗澡去了\n");


    }
}
