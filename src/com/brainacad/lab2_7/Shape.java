package com.brainacad.lab2_7;

/**
 * Created by SHARK on 29.01.2017.
 */
public class Shape {
    private String shapeColor;
    public double calcArea(){return 0.0;}

    @Override
    public String toString() {
        return "Shape{" +
                "shapeColor='" + shapeColor + '\'' +
                '}'+ calcArea();
    }
}
class Triangle extends Shape {
    private String shapeColor;
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        this.shapeColor = shapeColor;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcArea() {
        double s = (a + b + c) / 2;
        return  Math.sqrt(s * (s - a) * (s - b) * (s - c));


    }

    @Override
    public String toString() {
        return "This is Triangle " +
                "Color = " + shapeColor + "\n" +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c;
    }
}

class Rectangle extends Shape{
        private String shapeColor;
        private double width;
        private double height;

    public Rectangle(String shapeColor, double width, double height) {
        this.shapeColor = shapeColor;
        this.width = width;
        this.height = height;
    }

    public double calcArea(){
        return width * height;
    }

    @Override
    public String toString() {
        return "This is Rectangle " +
                "Color = " + shapeColor + "\n" +
                ", width=" + width +
                ", height=" + height ;
    }
}
class Circle extends Shape{
        private String shapeColor;
        double radius;

    public Circle(String shapeColor, double radius) {
        this.shapeColor = shapeColor;
        this.radius = radius;
    }

    public double calcArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "This is Circle " +
                "Color = " + shapeColor + "\n" +
                ", radius=" + radius;
    }
}


class Main1{
    // Задание 2-7-6 по 2-7-9.
    public static void main(String[] args) {
       Triangle triangle = new Triangle("Red",10, 15,8);
        System.out.println(triangle + " Shape area is " + triangle.calcArea());
        Rectangle rectangle = new Rectangle("Green",10,12);
        System.out.println(rectangle  + " Shape area is " + rectangle.calcArea());
        Circle circle = new Circle("Blue",20);
        System.out.println(circle  + " Shape area is " + circle.calcArea());
// Задание 2-7-10.
        Shape [] shapes = new Shape[9];
        Triangle triangle1 = new Triangle("Red", 10, 12, 8);
        shapes [0] = triangle1;
        shapes [1] = triangle;
        Circle circle1 = new Circle("Grey",21);
        shapes [2] = circle;
        shapes [3] = circle1;
        Rectangle rectangle1 = new Rectangle("White",18,10);
        Rectangle rectangle2 = new Rectangle("Brown",4,8);
        Rectangle rectangle3 = new Rectangle("Black",20,25);
        Rectangle rectangle4 = new Rectangle("Purple",12,23);
        shapes [4] = rectangle;
        shapes [5] = rectangle1;
        shapes [6] = rectangle2;
        shapes [7] = rectangle3;
        shapes [8] = rectangle4;
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        // "Пункт задачи 5 и 6"
        double sumArea = 0;
        for (Shape shape : shapes){
          // not need  System.out.println(shape.toString());
            sumArea += shape.calcArea();
        }
        System.out.print("Total area of all shapes = ");
        System.out.printf("%.2f",sumArea);
        double sumRectArea = 0;
        double sumTriangArea = 0;
        double sumCircArea = 0;
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                sumCircArea += shape.calcArea();
            }else if (shape instanceof Triangle){
                sumTriangArea += shape.calcArea();
            } else {
                sumRectArea += shape.calcArea();
            }
        }
        System.out.print("\n Circles total area = ");
        System.out.printf("%.2f",sumCircArea);
        System.out.print("\n Triangles total area = ");
        System.out.printf("%.2f",sumTriangArea);
        System.out.print("\n Rectangles total area = ");
        System.out.printf("%.2f",sumRectArea);

    }
}
