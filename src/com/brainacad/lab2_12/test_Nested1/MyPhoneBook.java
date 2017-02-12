package com.brainacad.lab2_12.test_Nested1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by SHARK on 08.02.2017.
 */

public class MyPhoneBook {
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber (String name, String phone){
        for (int i =0; i < phoneNumbers.length; i++){
            if (phoneNumbers[i] == null){
                phoneNumbers[i] = new PhoneNumber(name,phone);
                break;
            }
        }
    }
    public void printPhoneBook(){
        for (int i = 0; i < phoneNumbers.length; i++){
            if (phoneNumbers[i] != null){
                System.out.println(phoneNumbers[i]);
            }
        }
    }
    public void sortByName(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                if (o1 != null && o2 != null){
                    return o1.name.compareToIgnoreCase(o2.name);
                } else {
                    return 0;
                }
            }
        });
    }
    public void sortByPhone(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                if (o1 != null && o2 != null){
                    return o1.phone.compareToIgnoreCase(o2.phone);
                } else {
                    return 0;
                }
            }
        });
    }



     static class PhoneNumber {
        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }

}
class Main{
    public static void main(String[] args) {
        //lab 1
        MyPhoneBook myPhoneBook = new  MyPhoneBook ();
        myPhoneBook.addPhoneNumber("Sasha", "12131511");
        myPhoneBook.addPhoneNumber("Pasha", "5465464");
        myPhoneBook.addPhoneNumber("Katya", "14846481");
        System.out.println("Phone book without sort");
        myPhoneBook.printPhoneBook();
        // lab 2
        myPhoneBook.sortByName();
        System.out.println("PhoneBook with sort by name");
        myPhoneBook.printPhoneBook();
        myPhoneBook.sortByPhone();
        System.out.println("PhoneBook with sort by Phone ");
        myPhoneBook.printPhoneBook();

    }
}

