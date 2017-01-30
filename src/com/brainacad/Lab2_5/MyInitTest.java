package com.brainacad.Lab2_5;

/**
 * Created by SHARK on 20.01.2017.
 */
public class MyInitTest {
    int i;
    static
    {
        System.out.println("Static init block 1");
    }
    static
    {
        System.out.println("Static init block 2");
    }
    {
        System.out.println("non-static init block 1");
    }
    {
        System.out.println("non-static init block 2");
    }

    public MyInitTest() {
        this(1);
        System.out.println("constructor 2 ");
    }

    public MyInitTest(int i) {
        System.out.println("constructor 1");
    }

    public static void main(String[] args) {
           MyInitTest myInitTest = new MyInitTest();
    }
}
