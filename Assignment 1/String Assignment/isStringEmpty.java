import java.util.*;

class isStringEmpty{
    public static boolean isStringEmpty(String str){
        return str.isEmpty();
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        System.out.println("Is string empty: " + isStringEmpty(string));
    }
}