package Assignment_level_1;
import java.util.*;
public class AL1_StringPalindrome {
    public static void main(String[] args) {
        String st, rString="";
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        st = sc.nextLine();
        st = st.toLowerCase();
        for(int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            rString = ch + rString;
        }
        if(st.equals(rString))
            System.out.print("Palindrome");
        else
            System.out.print("Not a palindrome");
    }
}
