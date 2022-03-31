package com.example.javachallenge;

import java.util.Scanner;

public class Ques2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextInt();
        System.out.print("Enter height: ");
        double height = sc.nextInt();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " +volume);
    }
}
