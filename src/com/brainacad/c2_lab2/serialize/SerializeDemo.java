package com.brainacad.c2_lab2.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by SHARK on 23.04.2017.
 */
public class SerializeDemo {
    public static void main(String[] args) throws IOException {
        Employee emp = new Employee();
        emp.setName("Pecya");
        emp.setAdress("Kiev");
        emp.setSSN(125);
        emp.setNumber(146);
        FileOutputStream foe = new FileOutputStream("C:/Employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(foe);

        try {
            oos.writeObject(emp);
        } catch (IOException e){ e.printStackTrace();
        }
        finally {
            oos.close();
        }
    }


}

