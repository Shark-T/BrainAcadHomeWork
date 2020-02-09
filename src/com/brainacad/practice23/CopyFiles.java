package com.brainacad.practice23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by SHARK on 22.04.2017.
 */
public class CopyFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/brainacad/package_file/text.txt");
        File file2 = new File("src/com/brainacad/package_file/text2.txt");
        File file1 = new File("src/com/brainacad/package_file/folder/foldertext.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());

        System.out.println(Arrays.toString(file.list()));
        try (FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream("src/com/brainacad/package_to_copy/text.txt")){
            int data = fileInputStream.read();
            while (data != -1){
                fileOutputStream.write(data);
                data = fileInputStream.read();
            }


        }
        try (FileInputStream fileInputStream = new FileInputStream(file2);
             FileOutputStream fileOutputStream = new FileOutputStream("src/com/brainacad/package_to_copy/text2.txt")){
            int data = fileInputStream.read();
            while (data != -1){
                fileOutputStream.write(data);
                data = fileInputStream.read();
            }


        }
        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream fileOutputStream = new FileOutputStream("src/com/brainacad/package_to_copy/folder/foldertext.txt")){
            int data = fileInputStream.read();
            while (data != -1){
                fileOutputStream.write(data);
                data = fileInputStream.read();
            }


        }
    }
}
