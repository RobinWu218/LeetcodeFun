class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        int start, end;
        for (int i = 0; i<nums.length; i++){
            start = nums[i];
            while (i+1 < nums.length && nums[i+1] == nums[i] + 1){
                i++;
            }
            end = nums[i];
            result.add(helper(start, end));
        }
        return result;
    }
    
    public String helper(int lo, int hi){
        if (lo == hi) return Integer.toString(lo);
        return Integer.toString(lo) + "->" + Integer.toString(hi);
    }
}