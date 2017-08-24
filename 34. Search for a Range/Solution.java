class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1, left = 0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if (nums[mid] == target){
                start = mid;
                while(start-1 >= 0 && nums[start-1]==target)start--;
                end = mid;
                while(end+1 < nums.length && nums[end+1]==target)end++;
                break;
            }else if (nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        int[] result = {start,end};
        return result;
    }
}