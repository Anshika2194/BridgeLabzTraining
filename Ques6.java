import java.util.Scanner;

public class Ques6 {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  StringBuilder sb=new StringBuilder();
  for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    sb.append(ch-32);
  }

  System.out.println(sb.toString());
}
}
