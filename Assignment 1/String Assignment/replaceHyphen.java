import java.util.*;

class replaceHyphen{
    public static String replace(String str){
        str = str.replaceAll("[0-9]-[0-9]", "");
        return str;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = s.nextLine();
        System.out.println("String after hyphen removal: " + replace(string));
    }
}