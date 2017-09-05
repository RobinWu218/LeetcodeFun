class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtracking(result,new ArrayList<>(), 0, s);
        return result;
    }
    
    public void backtracking(List<List<String>> result, List<String> partial, int idx, String s){
        if (idx == s.length()){
            result.add(new ArrayList<String>(partial));
            return;
        }
        
        for (int i = idx; i < s.length(); i++){
            if (check(s,idx,i)){
                partial.add(s.substring(idx, i+1));
                backtracking(result, partial, i+1, s);
                partial.remove(partial.size()-1);
            }
        }   
    }
    
    public boolean check(String s, int left, int right){
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}