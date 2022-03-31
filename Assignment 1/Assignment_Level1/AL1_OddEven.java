import java.util.Scanner;

public class AL1_OddEven {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        String res = (a%2==0)?"Number is even":"Number is odd";
        System.out.println(res);
    }
}
