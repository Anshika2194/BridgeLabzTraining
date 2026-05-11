package Arrays;
//Prefix Sum Array
public class PrefixSum {
  static int[] prefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        return prefixSum;
    }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] prefixSum = prefixSum(arr);
    
    for (int i = 1; i < arr.length; i++) {
        prefixSum[i] = prefixSum[i - 1] + arr[i];
    }
    
    System.out.print("Prefix Sum Array: ");
    for (int num : prefixSum) {
        System.out.print(num + " ");
    }
  }
  
}
