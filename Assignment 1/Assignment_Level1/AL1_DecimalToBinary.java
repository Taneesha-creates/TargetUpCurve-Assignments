package Assignment_level_1;

import java.util.Scanner;

public class AL1_DecimalToBinary {
    public static void main(String[] args) {
        int n, binNum[] = new int[1000], i=0;
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            binNum[i++] = n%2;
            n = n/2;
        }
        for(int j = i-1; j>=0; j--){
            System.out.print(binNum[j]);
        }
    }
}
