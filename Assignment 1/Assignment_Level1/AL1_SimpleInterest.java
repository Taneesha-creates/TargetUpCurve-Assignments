import java.util.Scanner;

public class AL1_SimpleInterest {
    public static void main(String[] args) {
        /*
        SI = (P*R*T)/100;
        */
        float P, R, T, SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of P: ");
        P = sc.nextFloat();
        System.out.println("Enter value of R: ");
        R = sc.nextFloat();
        System.out.println("Enter value of T: ");
        T = sc.nextFloat();
        System.out.println("Simple Interest is: "+(P*R*T/100));
    }
}
