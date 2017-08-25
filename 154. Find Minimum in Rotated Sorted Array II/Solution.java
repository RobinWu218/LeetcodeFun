class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            if (nums[left] < nums[right]){
                return nums[left];
            }
            int mid = left + (right-left)/2;
            if (nums[mid]>nums[left]){
                left = mid+1;
            }else if (nums[mid] == nums[left]){
                for (int i = left+1; i<mid; i++){
                    if (nums[i]<nums[mid])return nums[i];
                }
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}