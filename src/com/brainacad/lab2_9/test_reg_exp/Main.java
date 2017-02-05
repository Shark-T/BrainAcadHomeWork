package com.brainacad.lab2_9.test_reg_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SHARK on 01.02.2017.
 */
public class Main {
    static boolean checkPersonWithRegExp(String userNameString){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(userNameString);
        return matcher.matches();

    }
    public static void main(String[] args) {
        String [] strs = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};
        for (String str : strs){
            System.out.print(str + " : ");
            System.out.print(checkPersonWithRegExp(str));
            System.out.println();

        }

    }
}
