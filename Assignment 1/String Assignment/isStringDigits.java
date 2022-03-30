import java.util.*;

class isStringDigits{
    public static boolean isDigits(String str){
        return str.matches("[0-9]+");
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine();
        System.out.println(isDigits(str));
    }
}