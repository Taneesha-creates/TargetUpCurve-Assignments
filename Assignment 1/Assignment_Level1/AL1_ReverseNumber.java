import java.util.Scanner;

import static java.lang.Math.pow;

public class AL1_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be reversed: ");
        int num = sc.nextInt();
        int rem, length =(int)(Math.log10(num)+1), sum=0;
        //System.out.println(length);
        while(num>0)
        {
            rem = num%10;
            sum += rem * pow(10, length-1);
            num = num/10;
            length--;
        }
        System.out.println("Reversed number is: "+sum);
    }
}
