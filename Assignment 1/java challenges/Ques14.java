package com.example.javachallenge;

import java.util.Scanner;

// Write a java program to read two string user input and check if first contains the second.
public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string2: ");
        String s2 = sc.nextLine();

        System.out.println(s1.contains(s2));
    }
}
