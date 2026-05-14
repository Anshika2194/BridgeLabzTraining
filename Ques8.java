import java.util.Scanner;
public class Ques8 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int countd=0;
    int counta=0;
    int counts=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(Character.isDigit(ch)){
        countd++;
      }
      else if(Character.isLetter(ch)){
        counta++;
      }
      else{
        counts++;
      }
    }
    System.out.println("Digits: " + countd);
    System.out.println("Letters: " + counta);
    System.out.println("Special Characters: " + counts);
  }
  
}
