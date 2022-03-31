import java.util.Scanner;

public class AL1_Pyramid1 {
    public static void main(String arg[])
    {
        /*
           *
           **
           ***
           ****
           *****
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
                if(j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println("");
        }
    }
}
