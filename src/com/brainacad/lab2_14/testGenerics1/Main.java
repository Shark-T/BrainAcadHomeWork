package com.brainacad.lab2_14.testGenerics1;

/**
 * Created by SHARK on 19.03.2017.
 */
class MyTuple <A,B,C>{
    A a;
    B b;
    C c;
    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class Main {
    public static void main(String[] args) {
        MyTuple <String, Integer, Long> myTuple = new MyTuple<>("hello",12, 55L);
        MyTuple <Double, String, String> myTuple2 = new MyTuple<>(12.5,"world", "truue");
    }
}
