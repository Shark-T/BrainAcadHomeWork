package com.brainacad.c2_lab9.demoproxy1;

/**
 * Created by SHARK on 03.06.2017.
 */
public class CalculateImpl implements Calculate {

    @Override
    public int multiplicate(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }
}
