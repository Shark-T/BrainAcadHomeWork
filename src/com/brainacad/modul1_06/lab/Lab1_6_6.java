package com.brainacad.modul1_06.lab;

import java.util.Arrays;

public class Lab1_6_6 {
	 public static void main(String [] args) {
         int[] arr = {-15, 3, 1, 5, -3, -10, -4, 2, -2, 4, -5, 1, 0, 2, 6, 7, 9, 8, 4, 5, 7, 1, 8, 2, 3, 5, 3, 10, 11, 14};
         // sort array
         for (int i = arr.length - 1; i > 0; i--) {
             for (int j = 0; j < i; j++) {
                 if (arr[j] > arr[j + 1]) {
                     int tmp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = tmp;
                 }
             }
         }
         System.out.println(Arrays.toString(arr));

     }
}
