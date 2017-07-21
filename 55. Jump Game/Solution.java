public class Solution {
    public boolean canJump(int[] nums) {
        int furthest = 0, last = nums.length -1;
        for (int i = 0; furthest >= i && furthest < last; i++){
            furthest = Math.max(furthest, nums[i]+i);
        }
        return furthest >= last;
    }
}