class WordDistance {

	Map<String, List<Integer>> map;

    public WordDistance(String[] words) {
        map = new HashMap<String, List<Integer>>();
        for (int i = 0; i<words.length; i++){
        	List<Integer> a;
        	if (!map.containsKey(words[i])){
        		a = new ArrayList<>();
        		a.add(i);
        		map.put(words[i],a);
        	}else{
        		a = map.get(words[i]);
        		a.add(i);
        	}
        }
    }
    
    public int shortest(String word1, String word2) {
        List<Integer> l1 = map.get(word1);
        List<Integer> l2 = map.get(word2);
        int i = 0, j = 0, idx1 = 0, idx2 = 0, min = Integer.MAX_VALUE;
        while (i<l1.size() && j < l2.size()){
        	idx1 = l1.get(i);
        	idx2 = l2.get(j);
        	if (idx1 < idx2){
        		min = Math.min(idx2-idx1, min);
        		i++;
        	}else{
        		min = Math.min(idx1-idx2, min);
        		j++;
        	}
        }
        return min;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */