package com.example.javachallenge;

import java.util.Scanner;

// Write a java program to calculate the largest number from the given three numbers using ternary operator.
public class Ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter num1: ");
        a = sc.nextInt();
        System.out.print("Enter num2: ");
        b = sc.nextInt();
        System.out.print("Enter num3: ");
        c = sc.nextInt();

        int max = ( a > b? (a > c? a : c): (b > c ? b: c));
        System.out.println("Maximum of "+a +" "+ b+ " " +c+ " is: "+max);
    }
}
