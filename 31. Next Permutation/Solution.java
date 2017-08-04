public class Solution {
    public void nextPermutation(int[] nums) {
        int start = nums.length - 1;
        while (start > 0 && nums[start]<= nums[start-1]){
            start--;
        }
        if (start == 0){
            Arrays.sort(nums);
        }else{
            int cmp = nums[start-1];
            for (int j = nums.length -1; j>= start; j--){
                if (nums[j]>cmp){
                    int temp = nums[j];
                    nums[j] = cmp;
                    nums[start-1] = temp;
                    break;
                }  
            }
            Arrays.sort(nums,start,nums.length);
        }
    }
}