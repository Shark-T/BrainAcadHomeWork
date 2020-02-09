package com.brainacad.c2_lab8.demosocket;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;

/**
 * Created by SHARK on 04.06.2017.
 */


//class Decript {
//    public  KeyGenerate() throws NoSuchAlgorithmException {
//        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//        keyGenerator.init(128);
//        return keyGenerator.generateKey();
//
//    }

//    public void Decrypt(String decstream) throws NoSuchPaddingException, NoSuchAlgorithmException {
//        Cipher cipher2 = Cipher.getInstance("AES");
//        cipher2.init(Cipher.DECRYPT_MODE, secretKey);
//        byte[] decryptedByte = cipher2.doFinal(encryptedData);
//        String decryptedLine = new String(decryptedByte);
//        System.out.println(decryptedByte);
//    }
//}
public class ThredServer extends Thread {
    private Socket socket;



    public ThredServer(Socket socket) {

        this.socket = socket;
    }



    @Override
    public synchronized void start() {
        BufferedReader bis;
        System.out.println("client connected");
        try {
            bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //ObjectInputStream oi = new ObjectInputStream(socket.getInputStream());
            //  Student std = (Student)oi.readObject();
//            while (true) {
                String line = bis.readLine();
                System.out.println(line);

         //   }
        } catch (IOException e) {
            System.out.println("disconnect client");
            e.printStackTrace();
        }
    }
}
