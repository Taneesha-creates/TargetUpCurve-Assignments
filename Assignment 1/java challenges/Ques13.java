package com.example.javachallenge;

import java.util.Scanner;

// Write a java program to count the number words in a string.
public class Ques13 {

    public static int countWords(String st){
        int count = 0;

        if(st == null)
            return 0;
        String[] arr = st.split(" ");
        return(arr.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Total words in the string: "+countWords(s));
    }
}
