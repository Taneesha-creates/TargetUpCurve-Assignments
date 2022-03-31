package com.example.javachallenge;
import java.io.*;

// Write a java program to write a data to the file using FileOutputStream.
public class Ques9 {
    public static void main(String[] args) throws Exception{

        String s = "Here is a sample text to the file.";
        try{
            FileOutputStream fout = new FileOutputStream("C://Users//pc//Desktop//file//abc.txt");

            char ch[] = s.toCharArray();
            for (int i = 0; i < s.length(); i++){
                fout.write(ch[i]);
            }

            fout.flush();
            fout.close();
        }
        catch(Exception e){
            System.out.println("An error occurred" +e);
        }
    }
}
