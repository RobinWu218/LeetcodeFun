class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, 1, n, k, new ArrayList<Integer>());
        return result;
    }
    
    public void helper(List<List<Integer>> result, int toBeSelected, int n, int k, List<Integer>cur){
        if (cur.size()==k){
            result.add(new ArrayList<Integer>(cur));
            return;
        }
        for (int i = toBeSelected; i<=n; i++){
            cur.add(i);
            helper(result,i+1, n, k, cur);
            cur.remove(cur.size()-1);
        }
        
    }
}