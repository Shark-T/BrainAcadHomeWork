package com.brainacad.practice35;

/**
 * Created by SHARK on 18.06.2017.
 */
public class Main {
    static MyObj objRef = null;

    public static void main(String[] args) throws InterruptedException {
        objRef = new MyObj(12345);
        objRef = null;
        System.out.println("test 1, Set objRef to " + objRef);
        System.gc();
        Thread.sleep(1000);
        System.out.println("objRef= " + objRef);
        objRef = null;
        System.out.println("test 2, Set objRef to " + objRef);
        System.gc();
        Thread.sleep(1000);
        System.out.println("obRef=" + objRef);
    }
}
