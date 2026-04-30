package Interface;
public class Teacher1 {

    static class Teacher {
        void run() {
            System.out.println("In parent");
        }
    }

    static class Student extends Teacher {
        void run() {
            System.out.println("In child");
        }
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.run();
    }
} 
  

