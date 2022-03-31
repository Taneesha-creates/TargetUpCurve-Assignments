package Assignment_level_1;

import java.util.Scanner;

public class AL1_BinaryToDecimal {
    public static void main(String[] args) {
        int n, dec=0, i=0, temp;
        System.out.print("Enter a binary number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            temp = n%10;
            dec += temp*Math.pow(2,i);
            i++;
            n = n/10;
        }
        System.out.print("Decimal: "+dec);
    }
}
