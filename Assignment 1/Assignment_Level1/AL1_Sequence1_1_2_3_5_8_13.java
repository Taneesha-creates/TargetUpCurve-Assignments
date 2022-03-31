package Assignment_level_1;

import java.util.Scanner;

public class AL1_Sequence1_1_2_3_5_8_13
{
    public static void main(String[] args) {
        int n, sum = 0, a = 1, b = 1;
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 0)
                System.out.print(b + ", ");
            sum = a + b;
            a = b;
            b = sum;
            if (i == n - 1)
                System.out.print(a);
            else
                System.out.print(a + ", ");
        }
    }
}

