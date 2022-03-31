import java.util.Scanner;

public class AL1_WholeFrac {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc= new Scanner(System.in);
        float num =sc.nextFloat();
        String new_num = Float.toString(num);
        String[] arrOfStr = new_num.split(".");

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
