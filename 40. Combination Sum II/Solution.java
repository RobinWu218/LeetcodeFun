public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];
        backtracking(candidates, 0, used, new ArrayList<>(), target, result);
        return result;
    }
    
    public void backtracking(int[] candidates, int toBeSelected, boolean[] used, List<Integer> cur, int target, List<List<Integer>> result){
        if (target < 0) return;
        if (target == 0){
            result.add(new ArrayList<Integer>(cur));
        }else{
            for (int i = toBeSelected; i<candidates.length; i++){
                if (used[i]) continue;
                if (i > 0 && candidates[i] == candidates[i-1] && !used[i-1]) continue;
                cur.add(candidates[i]);
                used[i] = true;
                backtracking(candidates,i+1, used, cur, target - candidates[i], result);
                cur.remove(cur.size()-1);
                used[i] = false;
            }
        }
    }
}