import java.util.*;

class lengthOfString{
    public static int len(String str){
        int len = 0;
        while (true){
            try{
                char ch = str.charAt(len);
                len++;
            }
            catch (Exception e){
                return len;
            }
        }
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = s.nextLine();
        System.out.println("Length of string: " + len(string));
    }
}