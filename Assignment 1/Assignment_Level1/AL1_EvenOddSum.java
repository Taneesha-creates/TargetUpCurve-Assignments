import java.util.Scanner;

public class AL1_EvenOddSum {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int N, EvenSum = 0, OddSum = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0; i < N; i++)
        {
            if(i%2!=0)
                OddSum += i;
            else
                EvenSum += i;
        }
        System.out.println("Even Sum: " + EvenSum);
        System.out.println("Odd Sum: " + OddSum);
    }
}
