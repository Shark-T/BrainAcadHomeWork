package com.brainacad.lab2_9.test_string_2;

/**
 * Created by SHARK on 01.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myStr1.length(); i++) {
            if (myStr2.indexOf(myStr1.charAt(i))< 0){
                sb.append(myStr1.charAt(i));
            }
        }
        System.out.println(sb);
    }

}
