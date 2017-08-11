public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = -1;
        int right = nums.length;
        while(right - left > 1){
            int mid = left + (right - left)/2;
            if (nums[mid]==target)return mid;
            
            if (nums[left+1] <= nums[mid]){
                if (nums[mid]>target && nums[left+1]<=target){
                    right = mid;
                }else{
                    left = mid;
                }
            }else{
                if (nums[mid]< target && nums[right-1]>=target){
                    left = mid;
                }else{
                    right = mid;
                }
            }
        }
        if (left == -1) return -1;
        return nums[left] == target ? left : -1;
    }
}