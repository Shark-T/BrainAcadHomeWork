package com.brainacad.c2_lab6.testannotation1;

import java.util.Arrays;

/**
 * Created by SHARK on 21.05.2017.
 */
public class Main {
    @Deprecated
    public static int findMax(int... array){
        int maximum = array[0];

        for (int i = 0; i < array.length; i++)
            if (maximum < array[i]) maximum = array[i];

        return maximum;
    }

    @SafeVarargs
    public static <T> T findMax1(T... array) {
        Arrays.sort(array);
            return array[array.length-1];
        }


    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println(findMax(431,4134,41,14,41,534,34,53,65,667,87,54));
        System.out.println(findMax1(431,4134,41,14,41,534,34,53,65,667,87,54));
    }
}
