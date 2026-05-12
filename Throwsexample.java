
import java.io.*;

public class Throwsexample {

    static void findFile() throws IOException {
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        System.out.println("Starting program...");

        try {
            findFile();
        } catch (IOException e) {
            System.out.println("Caught an error in main: File not found!");
        }

        System.out.println("Program finished safely.");
    }
}