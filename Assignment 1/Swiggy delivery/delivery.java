import java.util.*;

// creating exception class for non-deliverable zip codes
class CannotDeliverException extends Exception{
    // to display error message
    public CannotDeliverException(String errorMessage){
        // super to refer to the parent class object
        super(errorMessage);
    }
}

class Swiggy {
    public static void isDeliveryPossible(int zipCode) throws CannotDeliverException{
        // storing non deliverable zip codes
        List<Integer> invalidZips = Arrays.asList(123, 456, 789);
        // if zip code entered is non-deliverable throw exception
        if (invalidZips.contains(zipCode) == true){
            throw new CannotDeliverException("Cannot Deliver to your area :(");
        }
        else{
            // print delivery available since zip code is valid
            System.out.println("Delivery Available in your area!");
        }
    }

    public static void main(String args[]){
        int zipCode;
        System.out.println("Enter the zip code: ");
        Scanner s = new Scanner(System.in);
        zipCode = s.nextInt();
        try{
            isDeliveryPossible(zipCode);
        }
        catch (CannotDeliverException e) {
            System.out.println(e);
        }
    }
}