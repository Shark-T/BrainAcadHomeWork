package com.brainacad.lab2_5;

import java.util.Arrays;

/**
 * Created by SHARK on 20.01.2017.
 */
public class MyInit {
   /*int [] arr = new int [10];

    {
        for (int i = 0; i < arr.length; i++)
         arr [i]= (int) (100*Math.random());
    }
    static int [] arr = new int [10];

    {
        for (int i = 0; i < arr.length; i++)
            arr [i]= (int) (100*Math.random());
    }*/

     static int [] arr = new int [10];

   static {

        for (int i = 0; i < arr.length; i++)
            arr [i]= (int) (100*Math.random());
    }

     void printArray (){
         System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        MyInit myInit = new MyInit();
        myInit.printArray();
        MyInit myInit2 = new MyInit();
        myInit2.printArray();
        MyInit myInit3 = new MyInit();
        myInit3.printArray();
    }


}
