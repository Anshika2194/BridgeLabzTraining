package basic;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1=sc.nextLine();  
    String s2=sc.nextLine();
    s1=s1.replaceAll("\\s", "");
    s2=s2.replaceAll("\\s", "");  
    if(s1.length()!=s2.length()){
      System.out.println("Not Anagram");
    }
    else{
      char[] a1=s1.toLowerCase().toCharArray();
      char[] a2=s2.toLowerCase().toCharArray();
      java.util.Arrays.sort(a1);
      java.util.Arrays.sort(a2);
      if(java.util.Arrays.equals(a1, a2)){
        System.out.println("Anagram");
      }
      else{
        System.out.println("Not Anagram");
      }
    }
  }
}
