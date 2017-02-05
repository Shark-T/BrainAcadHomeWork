package com.brainacad.lab2_10.wrapper_demo;

/**
 * Created by SHARK on 03.02.2017.
 */
public class Main {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Integer x1 = 129;
        Integer x2 = new Integer(129);
        Integer x3 = Integer.valueOf(129);
        Integer x4 = Integer.parseInt("129");
        System.out.println("x1 == x2 - " + (x1 == x2));
        System.out.println("x2 == x3 - " + (x2 == x3));
        System.out.println("x3 == x4 - " + (x3 == x4));
        System.out.println("x4 == x1 - " + (x4 == x1));
        // equals method
        System.out.println("x1 equals x2 - " + x1.equals(x2));
        System.out.println("x2 equals x3 - " + x2.equals(x3));
        System.out.println("x3 equals x4 - " + x3.equals(x4));
        System.out.println("x4 equals x1 - " + x4.equals(x1));
    }

}
