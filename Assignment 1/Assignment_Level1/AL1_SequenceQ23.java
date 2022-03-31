package Assignment_level_1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class AL1_SequenceQ23 {
    public static void main(String[] args) {
        /*1, -2, 4, -6, 7, -10, 10, -14 ..............N*/
        /*
            Two Series:
            -2 -6 -10 -14
             1  4  7  10
             ------------
             odd index: 1*(-2) 3*(-2) 5*(-2) 7*(-2)
             even index: 1+(3)=4 4+(3)=7 7+(3)=10
             -------------
              1     1*(-2) 1+(3)=4 3*(-2) 4+(3)=7....
              0       1       2       3
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        int even = 1, oddsum = 1;
        for(int i = 0; i <= num; i++)
        {
            if(i%2!=0){
                System.out.print(even*(-2)+" ");
                even += 2;
            }
            else{
                System.out.print(oddsum+" ");
                oddsum += 3;
            }
        }
    }
}
