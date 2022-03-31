import java.util.Scanner;

public class AL1_FLargest_SLargest {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println("First largest is a: "+a);
            if(b>=c)
                System.out.println("Second largest is b: "+b);
            else
                System.out.println("Second largest is c: "+c);
        }
        else if(b>=a && b>=c)
        {
            System.out.println("First largest is b: "+b);
            if(a>=c)
                System.out.println("Second largest is a: "+a);
            else
                System.out.println("Second largest is c: "+c);
        }
        else{
            System.out.println("First largest is c: "+c);
            if(a>=b)
                System.out.println("Second largest is a: "+a);
            else
                System.out.println("Second largest is b: "+b);
        }

    }
}
