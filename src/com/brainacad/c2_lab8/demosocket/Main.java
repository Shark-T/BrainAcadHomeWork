package com.brainacad.c2_lab8.demosocket;

/**
 * Created by SHARK on 04.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyServer server = new MyServer();
        server.start();

    }

}

class Cl{
    public static void main(String[] args) {
        MyClient client = new MyClient();
        client.start();
    }

}