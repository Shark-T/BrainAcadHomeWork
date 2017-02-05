package com.brainacad.lab2_8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by SHARK on 27.01.2017.
 */
interface  Drawable{
    void draw();
}
public abstract class Shape implements Drawable{
    public abstract double calcArea();
    String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }
}

class Circle extends Shape implements Comparable, Comparator {
    String shapeColor;
    double radius;

    public Circle(String shapeColor, double radius) {
        this.shapeColor = shapeColor;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeColor='" + shapeColor + '\'' +
                ", radius=" + radius +
                '}';
    }

    public double calcArea(){
        return radius * radius * Math.PI;
    }
    public void draw(){
        System.out.println(toString());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        return this.calcArea()> circle.calcArea() ? 1 :
                this.calcArea()< circle.calcArea()? -1 : 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return shape1
                .getShapeColor()
                .compareToIgnoreCase(shape2.getShapeColor());
    }
}
class Rectangle extends Shape implements Comparable , Comparator {
    String shapeColor;
    double width;
    double height;

    public Rectangle(String shapeColor, double width, double height) {
        this.shapeColor = shapeColor;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "shapeColor='" + shapeColor + '\'' +
                ", width=" + width +
                ", height=" + height + " Shape area "+ calcArea() +
                '}' ;
    }

    public double calcArea(){
        return width * height;
    }
    public void draw(){
        System.out.println(toString());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        return this.calcArea()> rectangle.calcArea() ? 1 :
                this.calcArea()< rectangle.calcArea()? -1 : 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return shape1
                .getShapeColor()
                .compareToIgnoreCase(shape2.getShapeColor());
    }
}
class Triangle extends Shape implements Comparable, Comparator {
    String shapeColor;
    private double a;
    private double b;
    private double c;


    public Triangle(String shapeColor, double a, double b, double c) {
        this.shapeColor = shapeColor;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeColor='" + shapeColor + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double calcArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt (s * (s- a)*(s-b)*(s-c));
    }
    public void draw(){
        System.out.println(toString());
    }

    @Override
    public int compareTo( Object o) {
        Triangle triangle = (Triangle) o;
        return this.calcArea()> triangle.calcArea() ? 1 :
                this.calcArea()< triangle.calcArea()? -1 : 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return shape1
                .getShapeColor()
                .compareToIgnoreCase(shape2.getShapeColor());
    }
}
class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[6];
        Triangle triangle1 = new Triangle("Red", 10, 12, 8);
        shapes [0] = triangle1;
        Circle circle1 = new Circle("Grey",21);
        shapes [1] = circle1;
        Rectangle rectangle1 = new Rectangle("White",18,10);
        Rectangle rectangle2 = new Rectangle("Brown",4,8);
        Rectangle rectangle3 = new Rectangle("Black",20,25);
        Rectangle rectangle4 = new Rectangle("Purple",12,23);
        shapes [2] = rectangle1;
        shapes [3] = rectangle2;
        shapes [4] = rectangle3;
        shapes [5] = rectangle4;
        for (Shape shape : shapes) {
           shape.draw();
        }
    }
}
class MainRectangle{
    public static void main(String[] args) {
        // 2_8_3
        Rectangle rectangleOne = new Rectangle("red", 22, 23);
        Rectangle rectangleTwo = new Rectangle("green", 12, 21);
        System.out.println(rectangleOne.compareTo(rectangleTwo));
        //2_8_4
        Rectangle [] rectangles = new Rectangle[6];
        for (int i = 0; i < rectangles.length ; i++){
            rectangles [i] = new Rectangle("RED", Math.round(Math.random()*10),Math.round(Math.random()*10));
        }
        Arrays.sort(rectangles);
            for (Rectangle rectangle : rectangles){
                rectangle.draw();
        }
    }
}
class  ShapeColorComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        //
        return shape2.getShapeColor()
                .compareToIgnoreCase
                        (shape1
                .getShapeColor());
    }
}
class MainShapeColorComparator{
    public static void main(String[] args) {
        Shape [] shapes = {
            new Rectangle("red", 22, 23),
            new Rectangle("green", 12, 21),
            new Rectangle("grey", 12, 21),
            new Rectangle("yellow", 12, 21),
            new Triangle ("black", 12, 21, 43),
            new Triangle ("pink", 12, 21, 43),
            new Triangle ("white", 12, 21, 43),
            new Circle("blue", 12),
            new Circle("brown", 22)
        };
        Arrays.sort(shapes, new ShapeColorComparator());
       /*     for (Shape  shape : shapes){
                shape.draw();
            }*/

    }
}