public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, j = 1;
        while(j<nums.length){
            if (nums[j] != nums[i-1]){
                swap(nums, i, j);
                i++;
            }
            j++;
        }
        return i;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}