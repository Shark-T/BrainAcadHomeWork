package com.brainacad.lab2_9.test_tokennizer;

import java.util.StringTokenizer;

/**
 * Created by SHARK on 01.02.2017.
 */
public class Main {
     static void printTokenizer(String str, String delm) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, delm);
        System.out.println("String: " + str);
        System.out.println("Delimeter:" + "\"" + delm + "\"");
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Anatoliy";
        printTokenizer(myStr, "by");
    }
}
