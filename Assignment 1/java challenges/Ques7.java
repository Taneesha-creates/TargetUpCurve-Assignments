package com.example.javachallenge;

// Write a java program to calculate the average value of the array elements.
public class Ques7 {
    public static void main(String[] args) {
        int[] arr = {2, 12, 6, 8, 10, 4};
        int sum = 0;

        for (int i=0; i< arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Average value: "+(sum/arr.length));
    }
}
