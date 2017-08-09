public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(candidates, 0, new ArrayList<>(), target, result);
        return result;
    }
    
    public void backtracking(int[] candidates, int toBeSelected, List<Integer> cur, int target, List<List<Integer>> result){
        if (target < 0) return;
        if (target == 0){
            result.add(new ArrayList<Integer>(cur));
        }else{
            for (int i = toBeSelected; i<candidates.length; i++){
                cur.add(candidates[i]);
                backtracking(candidates,i, cur, target - candidates[i], result);
                cur.remove(cur.size()-1);
            }
        }
    }
}