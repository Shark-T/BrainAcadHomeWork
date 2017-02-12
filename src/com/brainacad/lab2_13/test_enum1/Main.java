package com.brainacad.lab2_13.test_enum1;


import java.util.Scanner;

/**
 * Created by SHARK on 10.02.2017.
 */
public class Main {
       public enum MyDayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
       public MyDayOfWeek nextDay (){
           MyDayOfWeek [] myDayOfWeeks = MyDayOfWeek.values();
           int  index = this.ordinal();
           if (index==myDayOfWeeks.length-1){
               index = 0;
           } else {
               index++;
           }
           return myDayOfWeeks[index];
       }
       }
    public static void main(String[] args) {
           //2_13_3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of week ");
        String day = scanner.nextLine();
        try {
            MyDayOfWeek dayOfWeek = MyDayOfWeek.valueOf(day.toUpperCase());
            System.out.println("The next day of week " + dayOfWeek.nextDay());
        } catch (IllegalArgumentException e){
            System.out.println("Day is not correct");
        }
        //2_13_2
       for (MyDayOfWeek dir : MyDayOfWeek.values()){
           switch (dir){
               case MONDAY: case WEDNESDAY: case FRIDAY:
                   System.out.println("My JavaDay is " + dir);
           }
       }
    }
}

