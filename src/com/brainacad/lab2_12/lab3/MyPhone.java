package com.brainacad.lab2_12.lab3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by SHARK on 08.02.2017.
 */
public class MyPhone {
    private MyPhoneBook phoneBook;

    public MyPhone(){ phoneBook = new MyPhoneBook();}

    public void switchOn(){
        // random
        Random random = new Random();
        for (int i = 0; i < phoneBook.phoneNumbers.length; i++) {
            String name = String.valueOf((char)(random.nextInt(26)+ 'a'));
            String phone = String.valueOf(random.nextInt(1000000));
            phoneBook.addPhoneNumber(name,phone);
        }
        System.out.println("loading phonebook records - OK");
    }

    public void call (int i){
        System.out.println(String.format("Calling to : Name %s phone : %s" ,
                phoneBook.phoneNumbers[i].getName(),
                phoneBook.phoneNumbers[i].getPhone()));
    }

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



         class PhoneNumber {
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


}
class Main{
    public static void main(String[] args) {
        // lab 3
        MyPhone myPhone = new MyPhone();
        myPhone.switchOn();
        myPhone.call(1);
        myPhone.call(5);

    }
}