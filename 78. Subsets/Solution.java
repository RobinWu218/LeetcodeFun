class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i<(1<<nums.length);i++){
            List<Integer> cur = new ArrayList<>();
            int count = nums.length-1;
            long t = (long)i;
            while (t!=0){
                if ((t & 1) != 0){
                    cur.add(nums[count]);
                }
                count--;
                t >>>= 1;
            }
            result.add(cur);
        }
        return result;
    }
}