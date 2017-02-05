package com.brainacad.lab2_10.my_shapes;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by SHARK on 27.01.2017.
 */
interface  Drawable{
    void draw();
}

public abstract class Shape implements Drawable {
    public static Shape parseShape(String nameShapeAndParams){
        String [] strs = nameShapeAndParams.split(":|,");
        Shape shape = null;
        //2_10_3
        /*switch ( strs[0].toLowerCase()){
            case "rectangle" : shape= new Rectangle(strs[1],Double.parseDouble(strs[2]),Double.parseDouble(strs[3]));
            break;
            case "circle" : shape= new Circle(strs[1],Double.parseDouble(strs[2]));
            break;
            case "triangle" : shape= new Triangle(strs[1],Double.parseDouble(strs[2]),Double.parseDouble(strs[3]),Double.parseDouble(strs[4]));
        }*/
        //2_10_4
        switch ( strs[0].toLowerCase()){
            case "rectangle" : shape =  Rectangle.parseRectangle(nameShapeAndParams);
                break;
            case "circle" : shape = Circle.parseCircle(nameShapeAndParams);
                break;
            case "triangle" : shape = Triangle.parseTriangle(nameShapeAndParams);
        }
        return shape;
    }
    public abstract double calcArea();
    String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }
}

class Circle extends Shape implements Comparable, Comparator {
    String shapeColor;
    double radius;

    public static Circle parseCircle (String nameCircAndParams){ // 2_10_4
        String [] strs = nameCircAndParams.split(":|,");
        Circle circle = new Circle(strs[1],Double.parseDouble(strs[2]));

        return circle;
    }

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

    public static Rectangle parseRectangle (String nameRectAndParams){ // 2_10_4
        String [] strs = nameRectAndParams.split(":|,");
        Rectangle rectangle = new Rectangle(strs[1],Double.parseDouble(strs[2]),Double.parseDouble(strs[3]));

        return rectangle;
    }

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

    public static Triangle parseTriangle (String nameTrianAndParams){ // 2_10_4
        String [] strs = nameTrianAndParams.split(":|,");
        Triangle triangle = new Triangle(strs[1],Double.parseDouble(strs[2]),Double.parseDouble(strs[3]),Double.parseDouble(strs[4]));

        return triangle;
    }

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
        Shape[] shapes = new Shape[6];
        Triangle triangle1 = new Triangle("Red", 10, 12, 8);
        Circle circle1 = new Circle("Grey",21);
        Rectangle rectangle1 = new Rectangle("White",18,10);
        Rectangle rectangle2 = new Rectangle("Brown",4,8);
        Rectangle rectangle3 = new Rectangle("Black",20,25);
        Rectangle rectangle4 = new Rectangle("Purple",12,23);
        shapes [0] = triangle1;
        shapes [1] = circle1;
        shapes [2] = rectangle1;
        shapes [3] = rectangle2;
        shapes [4] = rectangle3;
        shapes [5] = rectangle4;
        for (Shape shape : shapes) {
           shape.draw();
        }
        System.out.println("Task 2_10_5");
        
    }
}

class MainRectangle{ // запуск 2_10_3
    public static void main(String[] args) {
      Rectangle rectangle =  (Rectangle) Shape.parseShape("Rectangle: red,10,20");
      rectangle.draw();
      Circle circle =  (Circle) Shape.parseShape("circle: white,19");
      circle.draw();
      Triangle triangle = (Triangle) Shape.parseShape("Triangle: green,10,20,12");
      triangle.draw();
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
        Shape[] shapes = {
            new Rectangle("red", 22, 23),
            new Rectangle("green", 12, 21),
            new Rectangle("grey", 12, 21),
            new Rectangle("yellow", 12, 21),
            new Triangle("black", 12, 21, 43),
            new Triangle("pink", 12, 21, 43),
            new Triangle("white", 12, 21, 43),
            new Circle("blue", 12),
            new Circle("brown", 22)
        };
        Arrays.sort(shapes, new ShapeColorComparator());
       /*     for (Shape  shape : shapes){
                shape.draw();
            }*/

    }
}
