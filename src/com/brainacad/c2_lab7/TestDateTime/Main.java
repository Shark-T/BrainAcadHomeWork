package com.brainacad.c2_lab7.TestDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Locale;

/**
 * Created by SHARK on 06.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate localtime = LocalDate.now();
        LocalDate birthday = LocalDate.of(1983,6,25);
        Period yearOld = Period.between(birthday, localtime);
        LocalDate thisYear2 = LocalDate.of(2017,6,25);
        LocalDate thisYear = birthday.plusYears(yearOld.getYears())
                .plusMonths(yearOld.getMonths())
                .plusDays(yearOld.getDays());
        Period shredingerBirthday = Period.between(localtime, thisYear2);
        if (shredingerBirthday.isNegative()){
            System.out.println("ДР уже был");
        } else if(shredingerBirthday.isZero()) {
            System.out.println("Сегодня днюха");
        } else {
            System.out.println("ДР еще будет");
        }

        System.out.println("Сегодня  - " + localtime);
        System.out.println("День Рождения  - " + birthday);
        System.out.println("Сейчас Лет - " + yearOld.getYears());
        System.out.println("День недели при рождении  - " + birthday.getDayOfWeek());
        System.out.println("День недели дня рождения в этом году - " + thisYear.getDayOfWeek());


    }
}
