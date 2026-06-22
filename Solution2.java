import java.util.*;
class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=nums[nums.length-k];
        return ans;
        
    }
}