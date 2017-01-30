package com.brainacad.lab2_3;

/**
 * Created by SHARK on 16.01.2017.
 */
public class MyWindow {
    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;



    @Override
    public String toString() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
    void printFields(){
        System.out.println(toString());
    }

    public MyWindow() {
        this.width = 0;
        this.height = 0;
        this.numberOfGlass = 0;
        this.color = "white";
        this.isOpen = false;
    }

    public MyWindow(double width, double height) {
        this();
        this.width = width;
        this.height = height;

    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }
}
 class MyWindowName{
    public static void main(String[] args) {
        MyWindow mywindow = new MyWindow();
        mywindow.printFields();
        MyWindow [] myWindows = new MyWindow[5];
        myWindows[0]=new MyWindow();
        myWindows[1]=new MyWindow(1.3,1.5);
        myWindows[2]=new MyWindow(1.2, 1.5,3);
        myWindows[3]=new MyWindow(1.1,1.6,3,"Black");
        myWindows[4]=new MyWindow(1.2,1.7,3,"green",true);
            for (MyWindow myWin : myWindows){
                myWin.printFields(); // foreach пробегает по массиву и выводит каждый массив

            }
      //  MyWindow.width = 1
    }
}
