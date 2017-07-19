public class Solution {
    public int maxSubArray(int[] nums) {
        int min = 0, max = Integer.MIN_VALUE, sum = 0;
        for (int i : nums){
            sum += i;               
            max = Math.max(sum-min, max);
            min = Math.min(sum, min);
        }
        return max;
    }
}