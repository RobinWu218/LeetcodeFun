public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
        if (strs.length == 0) return sb.toString();
        for (String str : strs){
            minLength = Math.min(minLength, str.length());
        }
        for (int i = 0; i<minLength; i++){
            char cur = strs[0].charAt(i);
            for (String str: strs){
                if (str.charAt(i) != cur){
                    return sb.toString();
                }
            }
            sb.append(cur);
        }
        return sb.toString();
        
    }
}