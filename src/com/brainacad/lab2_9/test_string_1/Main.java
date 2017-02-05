package com.brainacad.lab2_9.test_string_1;

/**
 * Created by SHARK on 01.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        
        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3,7));
        System.out.println(reversString(myStr));
    }
    public static String reversString(String str){
        return new StringBuilder(str).reverse().toString();

    }
}
