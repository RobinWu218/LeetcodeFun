class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0){
            result.add(helper(lower, upper));
            return result;
        }
        if (nums[0]>lower){
            result.add(helper(lower,nums[0]-1));
        }
        for (int i = 1; i<nums.length; i++){
            if (nums[i] == nums[i-1] || nums[i] == nums[i-1]+1) continue;
            result.add(helper(nums[i-1]+1, nums[i]-1));   
        }
        if (nums[nums.length-1]<upper){
            result.add(helper(nums[nums.length-1]+1,upper));
        }
        return result;
    }
    
    public String helper(int lo, int hi){
        if (lo == hi) return Integer.toString(lo);
        return Integer.toString(lo) + "->" + Integer.toString(hi);
    }
}