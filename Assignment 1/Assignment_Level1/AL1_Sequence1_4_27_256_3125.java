package Assignment_level_1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class AL1_Sequence1_4_27_256_3125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++)
        {
            System.out.print((int)pow(i, i)+" ");
        }
    }
}
