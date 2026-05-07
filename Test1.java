
//Duplicte element with Hashset
// //Class Test{ 
//      public static void main(String[] args){
//      Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
//      int[] arr=new int[n];
//      for(int i=0;i<n;i++){
//       arr[i]=sc.nextInt();
//      }
//      duplicate(arr);
// }
//    void duplicate(int[] arr){
//       HashSet<Integer> set=new HashSet<>();
//        for(int i=0;i<n;i++){
//           set.add(arr[i]);
//       }
//       for(int num:set){
//       System.out.println(num);
//      }
      

// }}
 
//Class Duplicate without hashset

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Test1{ 
     public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
     removeDuplicate(arr,n);
}
   static void removeDuplicate(int[] arr,int n){
      ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<n;i++){  
          if(!list.contains(arr[i])){
             list.add(arr[i]);
          } }

         int[] uni=new int[list.size()];
         for(int i=0;i<list.size();i++){
            uni[i]=list.get(i);
         }  
         System.out.println(Arrays.toString(uni));

       }
      }
    
