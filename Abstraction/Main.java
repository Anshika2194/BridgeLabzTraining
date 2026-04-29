package Abstraction;

public class Main {
   public static void main(String[] args) {
        Parent obj = new Son();  

        obj.career("Anshika");
        obj.partner("Alex", 25);

        Parent.hello(); 
   }
}
