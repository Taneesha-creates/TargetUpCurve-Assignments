package com.example.javachallenge;

import java.util.Scanner;

// Write a java program to find the ASCII value of the character.
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input character: ");
        char ch = sc.next().charAt(0);

        int toASCII = (int) ch;
        System.out.println("ASCII value of "+ch+" is : "+toASCII);
    }
}
