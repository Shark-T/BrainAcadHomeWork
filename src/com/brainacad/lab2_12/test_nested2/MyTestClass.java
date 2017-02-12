package com.brainacad.lab2_12.test_nested2;

/**
 * Created by SHARK on 08.02.2017.
 */
public class MyTestClass {
    public void test(){
        System.out.println("test()");
    }
    static class MyStaticNested{
        int x = 1;
        static int a = 2;

        public int getX() {
            return x;
        }
        public void setX(int x) {
            this.x = x;
        }
        public static int getA() {
            return a;
        }
        public static void setA(int a) {
            MyStaticNested.a = a;
        }
    }
    class MyInner{
        int y = 3;
        int z = 5;

        public int getY() {
            return y;
        }
        public void setY(int y) {
            this.y = y;
        }
        public int getZ() {
            return z;
        }
        public void setZ(int z) {
            this.z = z;
        }
    }
    void method(){
        class MyLocal{
            MyInner myInner = new MyInner();
            MyStaticNested myStaticNested = new MyStaticNested();
        }
        System.out.println("My local class: " + new MyLocal());
        System.out.println("From MyLocal class invoke myInner " + new MyLocal());
    }

}
class Main {
    public static void main(String[] args) {
        MyTestClass myTestClass = new MyTestClass();
        myTestClass.test();
        myTestClass.method();
        MyTestClass.MyInner myInner = myTestClass. new MyInner();
        System.out.println("MyInner y: " + myInner.getY());
        MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
        System.out.println("MyStaticNested class get x: " + myStaticNested.getX());
    }


}
