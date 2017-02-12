package com.brainacad.lab2_11.MyShapes;

/**
 * Created by SHARK on 08.02.2017.
 */
// lab2_10_3


        import java.util.Scanner;

interface Drawable{
    void draw();
}

public abstract class Shape implements Drawable {
    private String shapeColor;

    public Shape(){};

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();

    //lab 2_10_3
    // nameShapeAndParams => Rectangle GREEN 10.0 20.0
    public static Shape parseShape(String nameShapeAndParams) throws InvalidShapeStringExeption {
        String[] strs = nameShapeAndParams.split(":|,");
        Shape shape = null;
        InvalidShapeStringExeption invalidShapeStringExeption
                = new InvalidShapeStringExeption(String.format("Not correct parameters of Shape: %s", nameShapeAndParams));
        try {
            switch (strs[0].toLowerCase()) {
                case "rectangle":
                    shape = new Rectangle(strs[1], //добавить parseRectangle
                            Double.parseDouble(strs[2]),
                            Double.parseDouble(strs[3]));
                    break;
                case "circle":
                    shape = new Circle(strs[1],
                            Double.parseDouble(strs[2]));
                    break;
                case "triangle":
                    shape = new Triangle(strs[1],
                            Double.parseDouble(strs[2]),
                            Double.parseDouble(strs[3]),
                            Double.parseDouble(strs[4]));
                    break;
                default:
                    throw invalidShapeStringExeption;
            }
        } catch (Exception e){
            throw invalidShapeStringExeption;

        }
        return shape;
    }

    @Override
    public String toString() {
        return "This is Shape, color is:" + shapeColor + '\n' +
                " Shape area is:" + calcArea();
    }
}

class Circle extends Shape implements Comparable{
    public static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea(){
        return radius * radius * PI;
    }

    @Override
    public String toString() {
        return "This is Circle, color:" + super.getShapeColor() +
                " radius="+ radius  +
                " Shape area is:" + calcArea();
    }

    public void draw(){
        System.out.println(toString());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        return this.calcArea() > circle.calcArea() ? 1 :
                this.calcArea() < circle.calcArea() ? -1 : 0;
    }

    static Circle parserCircle(String params){
        String[] strs = params.split(":|,");
        return new Circle(strs[1], Double.parseDouble(strs[2]));
    }
}

class Rectangle extends Shape implements Comparable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color:" + super.getShapeColor() +
                " width="+ width + " height= " + height  +
                " Shape area is:" + calcArea();
    }

    public void draw(){
        System.out.println(toString());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        return this.calcArea() > rectangle.calcArea() ? 1 :
                this.calcArea() < rectangle.calcArea() ? -1 : 0;
    }

    // params => Rectangle:GREEN 10 20
    static Rectangle parserRectangle(String paramsRectangle){
        String [] strs = paramsRectangle.split(":|,");
        return  new Rectangle(strs[1], Double.parseDouble(strs[2]), Double.parseDouble(strs[3]));
    }
}

class Triangle extends Shape implements Comparable{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "This is Triangle, color:" + super.getShapeColor() +
                " a="+ a + " b=" + b + " c=" + c +
                " Shape area is:" + calcArea();
    }

    public void draw(){
        System.out.println(toString());
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) o;
        return this.calcArea() > triangle.calcArea() ? 1 :
                this.calcArea() < triangle.calcArea() ? -1 : 0;
    }

    static Triangle parserTriangle(String params){
        String[] strs = params.split(":|,");
        return new Triangle(strs[1],
                Double.parseDouble(strs[2]),
                Double.parseDouble(strs[3]),
                Double.parseDouble(strs[4]));
    }
}


// lab2_10_3
/*class MainAllShape{
    public static void main(String[] args) {
        Rectangle rectangle = (Rectangle) Shape.parseShape("Rectangle:GREEN:10,20");
        rectangle.draw();
        Circle circle = (Circle) Shape.parseShape("Circle:RED:10");
        circle.draw();
        Triangle triangle = (Triangle) Shape.parseShape("Triangle:BLACK:15,23,36");
        triangle.draw();
    }
}*/

// lab2_10_4
class MainRectangle{
    public static void main(String[] args) {
        Rectangle rectangle = Rectangle.parserRectangle("Rectangle:GREEN:10,20");
        rectangle.draw();
    }
}

class MainCircle{
    public static void main(String[] args) {
        Circle circle = Circle.parserCircle("Circle:BLACK:15");
        circle.draw();
    }
}

class MainTriangle{
    public static void main(String[] args) {
        Triangle triangle = Triangle.parserTriangle("Triangle:RED:10,12,13");
        triangle.draw();
    }
}

//lab 2_10_5
//        Rectangle:RED:11,22
//        Triangle:BLACK:5,5,5
//        Circle:GREEN:10
class Main{
    public static void main(String[] args) {
        System.out.println("Enter a number of shape: ");
        Scanner scanner = new Scanner(System.in);
        int numberShape = scanner.nextInt();
        Shape[] shapes = new Shape[numberShape];
        System.out.println("Enter shapes on new line (q - exit): ");
        int count = 0;
        while (scanner.hasNext()) {
            String inputStr = scanner.next();
                if (!inputStr.equals("q")) {
                    try {
                        shapes[count] = Shape.parseShape(inputStr);
                        count++;
                    } catch (InvalidShapeStringExeption e) {
                        e.printStackTrace();
                        System.exit(0);
                    }
                } else {
                    break;
                }
            }
        scanner.close();
        for(Shape shape : shapes){
            shape.draw();
        }
    }
}
// 2_11_4
class InvalidShapeStringExeption extends Exception{
    public InvalidShapeStringExeption(String message) {
        super(message);
    }
}
