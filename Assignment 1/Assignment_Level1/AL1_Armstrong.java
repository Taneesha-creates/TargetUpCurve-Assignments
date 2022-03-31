package Assignment_level_1;

import java.util.Scanner;

public class AL1_Armstrong {
    public static void main(String[] args) {
        int n, temp=0, rem=0, sum=0;
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n;
        while(temp>0){
            rem = temp%10;
            sum += rem*rem*rem;
            temp = temp/10;
        }
        if(n == sum)
            System.out.print("Armstrong Number");
        else
            System.out.print("Not an armstrong Number");
    }
}
