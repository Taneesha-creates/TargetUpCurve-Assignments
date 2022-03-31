import java.util.Scanner;

import static java.lang.Math.pow;

public class AL1_Sequence1_5_13_29_49_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        int output = 1;
        System.out.print(output+" ");
        for(int i = 1; i <= num; i++)
        {
            if(i%3!=0)
            {
                output += 4*i;
                System.out.print(output+" ");
            }
        }
    }
}
