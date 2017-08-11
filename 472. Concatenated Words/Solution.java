public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> preWords = new HashSet<>();
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        });
        
        for (int i = 0; i< words.length; i++){
            if (wordBreak(words[i],preWords)){
                result.add(words[i]);
            }
            preWords.add(words[i]);
        }
        return result;
        
    }
    
    public boolean wordBreak(String s, Set<String> dict) {
        if (dict.isEmpty())return false;
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