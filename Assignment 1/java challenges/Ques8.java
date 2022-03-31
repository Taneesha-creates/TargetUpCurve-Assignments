package com.example.javachallenge;
import java.io.File;
import java.io.IOException;

// Write a java program to create a file in java.
public class Ques8 {
    public static void main(String[] args) {
        try{
            File file = new File("C://Users//pc//Desktop//file//abc.txt");
            if (file.createNewFile()){
                System.out.println("File: " + file.getName() + " created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch (IOException e){
            System.out.println("An error occurred: "+ e);
        }
    }
}
