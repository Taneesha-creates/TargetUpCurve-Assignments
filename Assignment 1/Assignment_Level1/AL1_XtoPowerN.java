package Assignment_level_1;

import java.util.Scanner;

public class AL1_XtoPowerN {
    public static void main(String[] args) {
        int X, n, res=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value: ");
        X = sc.nextInt();
        System.out.println("Enter exponent value: ");
        n = sc.nextInt();
        int exponent = n;
        while(n!=0){
            res = res*X;
            --n;
        }
        System.out.print(X+" to the power of "+exponent+" is "+res);
    }
}
