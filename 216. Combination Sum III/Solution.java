class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<Integer>(), 0, 1, n, k);
        return result;
    }
    
    public void backtracking(List<List<Integer>> result, List<Integer> cur, int sum, int toBeSelected, int n, int k){
        if (cur.size() > k || sum > n) return;
        if (cur.size() == k && sum == n){
            result.add(new ArrayList<Integer>(cur));
            return;
        }
        
        while(toBeSelected <= 9){
            cur.add(toBeSelected);
            backtracking(result, cur, sum+toBeSelected, toBeSelected+1, n, k);
            cur.remove(cur.size()-1);
            toBeSelected++;
        }
    }
}