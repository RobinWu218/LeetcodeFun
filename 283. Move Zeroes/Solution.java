public class Solution {
    public void moveZeroes(int[] nums) {
        int lastZero = -1;
        for (int i = 0; i<nums.length; i++){
            if (lastZero == -1 && nums[i] == 0){
                lastZero = i;
            }
            
            if (nums[i] != 0 && lastZero != -1){
                swap(nums, i, lastZero++);
            }
        }
    }
    
    public void swap (int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    
}