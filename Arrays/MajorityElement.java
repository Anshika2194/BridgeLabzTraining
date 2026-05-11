package Arrays;
//Majority Element (Boyer Moore Voting)
public class MajorityElement {
  static int majorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;
        
         for(int i = 1; i < arr.length; i++) {

            if(count == 0) {
                candidate = arr[i];
            }

            if(arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int majority = majorityElement(arr);
        System.out.println("Majority Element: " + majority);
    }
}
