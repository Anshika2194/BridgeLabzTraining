
public class Throwexample {

   
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Access Denied: You must be at least 18 years old.");
        } else {
            System.out.println("Access Granted: Welcome!");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Registration System ---");
        
        try {
            
            validateAge(15); 
        } catch (IllegalArgumentException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
           
            validateAge(21);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues execution...");
    }
}