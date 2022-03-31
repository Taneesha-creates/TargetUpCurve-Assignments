import java.util.Scanner;

public class AL1_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Swapping two digits \n2. Swapping three digits\n Choose your option: \n");
        int option = sc.nextInt();//reads string
        switch (option){
            case 1:
                int a, b;
                System.out.println("Enter values of a and b: \n");
                a = sc.nextInt();//30
                b = sc.nextInt();//20
                System.out.println("Before swapping: \na = "+a+"\nb = "+b);
                a = a+b;//50
                b = a-b;//50-20=30
                a = a-b;//50-30=20
                System.out.println("After swapping: \na = "+a+"\nb = "+b);
                break;
            case 2:
                int c;
                System.out.println("Enter values of a, b and c: \n");
                a = sc.nextInt();//30
                b = sc.nextInt();//20
                c = sc.nextInt();//10
                System.out.println("Before swapping: \na = "+a+"\nb = "+b+"\nc = "+c);
                a = a+b+c;//60
                b = a-(b+c);//60-(20+10)=30
                c = a-(b+c);//60-(30+10)=20
                a = a-(b+c);//60-(30+20)=10
                System.out.println("After swapping: \na = "+a+"\nb = "+b+"\nc = "+c);
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}
