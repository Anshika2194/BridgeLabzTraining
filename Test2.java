import java.util.*;
public class Test2{ 
     public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     int n=str.length();
     uppercase(str,n);
}
 static void uppercase(String str,int n){
  StringBuilder sb=new StringBuilder(n);
   
   for(int i=0;i<n;i++){
      sb.append(str.charAt(i) - 32);
}
System.out.println(sb.toString());

}
}
