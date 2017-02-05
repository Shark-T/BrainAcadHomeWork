package com.brainacad.lab2_10.wrapper_demo2;

/**
 * Created by SHARK on 03.02.2017.
 */
public class Main {
    static Long compute (Byte x,Integer x1){

        return (long)  x + x1;
        // или так long c = x+x1 return c
        // return new Long (x + x1)
    }
    public static void main(String[] args) {
        System.out.println(compute(new Byte ((byte)11), new Integer ((int)111) ));
    }
}
