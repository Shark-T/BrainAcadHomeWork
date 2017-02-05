package com.brainacad.lab2_9.test_string_3;

/**
 * Created by SHARK on 01.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(uniqueChars("Using methods of class String"));
    }

    public static char[] uniqueChars(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (sb.indexOf(String.valueOf(str.charAt(i)))<0) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString().toCharArray();
    }

}
