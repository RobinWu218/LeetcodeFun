public class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        return backtracking(s, dict, new HashMap<String, ArrayList<String>>());
        
    }
    
    public List<String> backtracking(String s, Set<String>dict, HashMap<String, ArrayList<String>> history){
        if (history.containsKey(s)){
            return history.get(s);
        }
        
        ArrayList<String> result = new ArrayList<>();
        if (s.length() == 0){
            result.add("");
            return result;
        }
        
        for (String word: dict){
            if (s.startsWith(word)){
                List<String> subList = backtracking(s.substring(word.length()),dict, history);
                for (String sub:subList){
                    result.add(word + (sub.isEmpty()?"":" ")+sub);
                }
            }
        }
        
        history.put(s,result);
        return result;
    }
}