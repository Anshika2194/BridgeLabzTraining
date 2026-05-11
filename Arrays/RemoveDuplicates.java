package Arrays;
//Remove Duplicates from Sorted Array

public class RemoveDuplicates {
  static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        
        int uniqueIndex = 1; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex - 1]) {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }
        
        return uniqueIndex; 
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
  
}
