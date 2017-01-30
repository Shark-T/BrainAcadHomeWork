package com.brainacad.lab2_4;

/**
 * Created by SHARK on 20.01.2017.
 */
public class MyPiramid {
    static void myPiramidBest(int h) {
        if (h < 1 || h > 9) {
            System.out.println("The number must be in range 1...9");
            return;
        }
        for (int i = 1; i <= h; i++) {
            System.out.printf("%" + (h + 1 - i) + "s", " ");
            int minus = 0;
            for (int j = 1; j < i * 2; j++) {
                minus = j > i ? minus += 2 : 0;
                System.out.print(j - minus);
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        myPiramidBest(9);
    }
}
