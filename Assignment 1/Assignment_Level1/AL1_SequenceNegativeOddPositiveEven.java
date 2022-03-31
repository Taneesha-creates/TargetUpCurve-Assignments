import java.util.Scanner;

import static java.lang.Math.pow;

public class AL1_SequenceNegativeOddPositiveEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
            else
                System.out.print("-"+i+" ");
        }
    }
}
