class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i<nums.length; i++){
            int cur = nums[i];
            if (count==0){
                candidate = cur;
                count = 1;
            }else{
                if (candidate == cur){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return candidate;
    }
}