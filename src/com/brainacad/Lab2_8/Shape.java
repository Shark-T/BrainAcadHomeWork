package com.brainacad.Lab2_8;

/**
 * Created by SHARK on 27.01.2017.
 */
interface  Drawable{
    void draw();
}
public abstract class Shape implements Drawable{
    public abstract double calcArea();

}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        return radius * radius * Math.PI;
    }
    public void draw(){
        System.out.println(toString());
    }
}
class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calcArea(){
        return width * height;
    }
    public void draw(){
        System.out.println(toString());
    }
}
class Triangle extends Shape {
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt (s * (s- a)*(s-b)*(s-c));
    }
    public void draw(){
        System.out.println(toString());
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}