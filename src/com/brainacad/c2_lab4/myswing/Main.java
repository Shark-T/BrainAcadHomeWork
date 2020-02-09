package com.brainacad.c2_lab4.myswing;

import java.io.IOException;

/**
 * Created by SHARK on 07.05.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        MyApplication myApp = new MyApplication("Shark");
        myApp.createControlsRun();
        myApp.validate();
    }
}
