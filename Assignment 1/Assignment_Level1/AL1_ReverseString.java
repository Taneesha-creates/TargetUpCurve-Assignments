package Assignment_level_1;
import java.util.*;
public class AL1_ReverseString {
    public static void main(String[] args) {
        String str, rev = "";
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.print(rev);
    }
}
