import java.sql.SQLOutput;
import java.util.Scanner;

public class AL1_Pyramid2 {
    public static void main(String args[])
    {
        /*
                *
               * *
              * * *
             * * * *
            * * * * *
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int k = 1, n;
        n = sc.nextInt();
        for(int i = 1; i <=n; i++)
        {

            for(int j = 1; j <=n+4; j++)
            {
                if(j>=6-i && j<=4+i && k==1){
                    System.out.print("*");
                    k = 0;
                }
                else {
                    System.out.print(" ");
                    k = 1;
                }
            }
            System.out.println("");
        }
    }
}
