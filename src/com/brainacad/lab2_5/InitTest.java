package com.brainacad.lab2_5;

/**
 * Created by SHARK on 20.01.2017.
 */
public class InitTest {
    private int id;
    private static int nextId;
    static{
        nextId = (int) (1000*Math.random());
    }
    {
        id = ++nextId;
    }
    int getId(){
        return id;
    }

    public static void main(String[] args) {
        InitTest initTest = new InitTest();
        System.out.println(initTest.getId());
        InitTest initTest2 = new InitTest();
        System.out.println(initTest2.getId());
        InitTest initTest3 = new InitTest();
        System.out.println(initTest3.getId());
        InitTest initTest4 = new InitTest();
        System.out.println(initTest4.getId());
    }
}
