package com.brainacad.c2_lab2.serialize;

import java.io.*;

/**
 * Created by SHARK on 23.04.2017.
 */
public class DeserializeDemo {
    public static void main(String[] args) throws IOException {
        Employee emp2;
        FileInputStream fie = new FileInputStream("C:/Employee.ser");
        ObjectInputStream ois = new ObjectInputStream(fie);

        try {
            emp2 = (Employee)ois.readObject();
            System.out.println(emp2);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
        }
}
