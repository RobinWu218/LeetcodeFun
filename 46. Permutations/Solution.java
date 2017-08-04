public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtracking(nums, cur, result);
        return result;
    }
    
    public void backtracking(int[] nums, List<Integer> cur, List<List<Integer>> result){
        if (cur.size() == nums.length){
            result.add(new ArrayList<>(cur));
            return;
        } 
        for (int i = 0; i<nums.length; i++){
            if (!cur.contains(nums[i])){
                cur.add(nums[i]);
                backtracking(nums,cur,result);
                cur.remove(cur.size()-1);
            }
        }
    }
}