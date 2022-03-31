package Assignment_level_1;

import java.util.Scanner;

public class AL1_PrimeN_M {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n and m: ");
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = n; i <= m; i++)
        {
            if(i==1 || i==0)
                continue;

            int flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }
}
