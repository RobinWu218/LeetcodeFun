class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int iter = 0, min = words.length, id1 = -1, id2 = -1;
        while (iter < words.length){
        	if (words[iter].equals(word1)) id1 = iter;
        	if (words[iter].equals(word2)) id2 = iter;
        	if (id1 != -1 && id2 != -1){
        		min = Math.min(min, Math.abs(id1-id2));
        	}
        	iter++;
        }
        return min;
    }
}