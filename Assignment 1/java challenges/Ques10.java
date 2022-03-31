package com.example.javachallenge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Write a java program to copy data from one file to another file.
public class Ques10 {
    public static void main(String[] args) {

        try {
            File f1 = new File("C://Users//pc//Desktop//file//file1.txt");
            File f2 = new File("C://Users//pc//Desktop//file//file2.txt");

            FileInputStream fin = new FileInputStream("C://Users//pc//Desktop//file//file1.txt");
            FileOutputStream fout = new FileOutputStream("C://Users//pc//Desktop//file//file2.txt");
            byte[] buffer = new byte[500];
            int length;

            while ((length = fin.read(buffer)) > 0) {
                fout.write(buffer, 0, length);
            }
            fin.close();
            fout.close();
            System.out.println("File copied");
        } catch (IOException e) {
            System.out.println("An error occurred");
        }

    }
}
