public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] table = new boolean[s.length()];
        for (int i = 0; i<s.length(); i++){
            if (dict.contains(s.substring(0,i+1))){
                table[i]=true;
            }
            if (!table[i]){
                for (int j = 0; j<i; j++){
                    if (table[j] && dict.contains(s.substring(j+1,i+1))){
                        table[i]=true;
                        break;
                    }
                }
            }
        }
        return table[s.length()-1];
    }
}