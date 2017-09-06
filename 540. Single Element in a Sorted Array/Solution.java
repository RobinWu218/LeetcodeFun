class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left)/2;
            if (mid==0 || mid == nums.length-1) return nums[mid];
            if (nums[mid+1] != nums[mid] && nums[mid-1] != nums[mid]) return nums[mid];
            if (nums[mid-1] == nums[mid]){
                if ((mid+1) % 2 == 0){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else{
                if ((mid+1) % 2 == 0){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return nums[left];
    }
}