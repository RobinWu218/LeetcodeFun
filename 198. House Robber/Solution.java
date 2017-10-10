class Solution {
    public int rob(int[] nums) {
        // if (nums.length == 0) return 0;
        // if (nums.length == 1) return nums[0];
        // int[] dp = new int[nums.length];
        // dp[0] = nums[0];
        // dp[1] = nums[0]<nums[1]? nums[1] : nums[0];
        // int max = Math.max(dp[0],dp[1]);
        // for (int i = 2; i<nums.length; i++){
        //     dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        //     max = Math.max(max, dp[i]);
        // }
        // return max;
        int rob = 0, notrob = 0;
        for (int t: nums){
            int currob = notrob + t;
            notrob = Math.max(rob, notrob);
            rob = currob;
        }
        return Math.max(rob,notrob);
    }
}