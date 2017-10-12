class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        boolean sameWord = word1.equals(word2)? true : false;
        int idx1 = -1, idx2 = -1, iter = 0, min = words.length, previous = -1;
        for (int i = 0; i < words.length; i++){
        	if (words[iter].equals(word1)){
        		if (sameWord){
        			previous = idx1;
        		}
        		idx1 = iter;
        	}

        	if (words[iter].equals(word2)){
        		if (sameWord){
        			idx2 = previous;
        		}else{
        			idx2 = iter;
        		}
        	}

        	if (idx1 != -1 && idx2 != -1){
        		min = Math.min(min, Math.abs(idx1-idx2));
        	}

        	iter++;
        }
        return min;
    }
}