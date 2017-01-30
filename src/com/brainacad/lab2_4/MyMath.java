package com.brainacad.lab2_4;

import java.util.Arrays;

/**
 * Created by SHARK on 18.01.2017.
 */
public class MyMath {
    final static double PI =3.14;

    public static double areaOfCircle(double radius){ // метод площади окружности
        return  radius*radius*PI;
    }

    public static int findMin (int [] array){ // метод нахождения минимума из массива
        Arrays.sort(array);
        return array[0] ;
    }
    public static int findMax (int [] array){ // метод нахождения максимума из массива
        Arrays.sort(array);
        return array [array.length - 1 ];
    }

}
class Calculation{
    public static void main(String[] args) {
        int [] array = {5,10,1,4,7,12,9};
        int [] array2 = {5,10,1,4,7,12,9};
        System.out.println("Min array " + MyMath.findMin(array));
        System.out.println("Max array2 " + MyMath.findMax(array2));
        System.out.println( MyMath.areaOfCircle ( 25.3));

    }
}
