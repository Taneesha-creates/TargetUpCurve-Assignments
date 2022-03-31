import java.util.Scanner;

import static java.lang.Math.pow;

public class AL1_Sequence1_4_9_25_36_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++)
            System.out.print((int)pow(i, 2)+" ");
    }
}
