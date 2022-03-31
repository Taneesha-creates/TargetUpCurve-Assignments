import java.util.Scanner;

import static java.lang.Math.pow;

public class AL1_Sequence4_16_36_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        for(int i = 2; i <= num*2; )
        {
            System.out.print((int)pow(i, 2)+" ");
            i = i+2;
        }
    }
}
