import java.util.*;

class CannotDeliverException extends Exception{
    public CannotDeliverException(String errorMessage){
        super(errorMessage);
    }
}

class Swiggy {
    public static void isDeliveryPossible(int zipCode) throws CannotDeliverException{
        List<Integer> invalidZips = Arrays.asList(123, 456, 789);
        if (invalidZips.contains(zipCode) == true){
            throw new CannotDeliverException("Cannot Deliver to your area :(");
        }
        else{
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