package com.example.javachallenge;

import java.util.Scanner;

// Write a java program to check if given number is a perfect square.
public class Ques5 {

    public static boolean isPerectSq(int num){
        if (num >= 0){
            int sq = (int)Math.sqrt(num);
            if ((sq*sq) == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerectSq(num))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
