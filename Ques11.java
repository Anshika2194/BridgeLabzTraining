import java.util.HashSet;
import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        boolean unique = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!set.add(ch)) {
                unique = false;
                break;
            }
        }
        System.out.println(unique);
    }
}
//without hashset
// import java.util.Scanner;

// public class Ques11 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();

//         boolean unique = true;

//         for (int i = 0; i < str.length(); i++) {

//             for (int j = i + 1; j < str.length(); j++) {

//                 if (str.charAt(i) == str.charAt(j)) {
//                     unique = false;
//                     break;
//                 }
//             }

//             if (!unique) {
//                 break;
//             }
//         }

//         if (unique) {
//             System.out.println("String contains only unique characters");
//         } else {
//             System.out.println("String contains duplicate characters");
//         }
//     }
// }