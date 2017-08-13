public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length()==0) return result;
        char[] cur = new char[digits.length()];
        backtracking(digits,0,cur,result);
        return result;
    }
    
    final String[] MAP = {"0", "1", "abc", "def", "ghi", "jkl", "mno","pqrs","tuv","wxyz"};
    public void backtracking(String digits, int idx, char[] cur, List<String> result){
        if (idx == digits.length()){
            result.add(new String(cur));
            return;
        }
        int curNum = digits.charAt(idx) - '0';
        for (int i = 0; i<MAP[curNum].length();i++){
            cur[idx] = MAP[curNum].charAt(i);
            backtracking(digits,idx+1,cur,result);
        }
    }
}