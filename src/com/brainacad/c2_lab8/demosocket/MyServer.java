package com.brainacad.c2_lab8.demosocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by SHARK on 04.06.2017.
 */
public class MyServer extends Thread {
    @Override
    public synchronized void start() {
        BufferedReader bis = null;
        Socket socket = null;
        try
                (ServerSocket listener = new ServerSocket(8899)) {
            System.out.println("server starts");
            System.out.println("wait for connection");
           while (true) {
               socket = listener.accept();
               new ThredServer(socket).start();
//               System.out.println("client connected");
//               bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//               //ObjectInputStream oi = new ObjectInputStream(socket.getInputStream());
//               //  Student std = (Student)oi.readObject();
//               while (true) {
//                   String line = bis.readLine();
//                   System.out.println(line);
//               }
           }
            // System.out.println(std);

            //  oi.close();

        } catch (IOException e) {
            try {
                bis.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
            // }catch (ClassNotFoundException e) {
            //  e.printStackTrace();
        }
    }
}
