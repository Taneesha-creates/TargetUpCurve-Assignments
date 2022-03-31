package com.example.javachallenge;

import java.util.Scanner;

// Write a java program to check if input year is leap year or not.
public class Ques6 {

    static boolean isLeapYear(int year)
    {
        return((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        System.out.println(isLeapYear(year)? "A leap year": "Not a leap year");
    }
}
