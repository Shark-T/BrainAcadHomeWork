package com.brainacad.c2_lab8.demosocket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by SHARK on 04.06.2017.
 */
public class MyClient extends Thread {
    @Override
    public synchronized void start() {
        Student std =new Student("Kolya", "Java 2",2);
        System.out.println("new student ");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try(Socket socket = new Socket("localhost", 8899)){
            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
            os.writeObject(std);
            System.out.println("try send");
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
