import java.util.*;

public class deleteAllOccurences{
    private static Scanner s;

    public static void main(String args[]){
        String stringToDeleteChar;
        char deleteChar;
        s = new Scanner(System.in);
        System.out.print("Please Enter String to Delete All Characters =  ");
        stringToDeleteChar = s.nextLine();

        System.out.print("Enter the Character to Delete =  ");
        deleteChar = s.next().charAt(0);

        String out = stringToDeleteChar.replace(deleteChar, Character.MIN_VALUE);
        System.out.println("The Final String after deleting character " +
                deleteChar + " is " + out);
    }
}