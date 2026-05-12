
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingSystem {
    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
          throw new InvalidAgeException("Age " + age + " is too young to vote!");
        } else {
            System.out.println("Welcome! You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        int userAge = 16;

        try {
            System.out.println("Checking age: " + userAge);
            checkEligibility(userAge);
        } 
        catch (InvalidAgeException e) {
            System.err.println("Custom Error Caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Verification process complete.");
        }
    }
}