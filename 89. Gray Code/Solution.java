public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>(Arrays.asList(0));
        backtracking(n, new HashSet<Integer>(Arrays.asList(0)), result);
        return result;
    }
    
    public boolean backtracking(int n, Set<Integer>history, List<Integer> result){
        if (result.size() == (1<<n)){
            return differByOne(result.get(0),result.get(result.size()-1));
        }
        
        for (int i = 0; i<n; i++){
            int prevCode = result.get(result.size()-1);
            int possibleNextCode = prevCode ^ (1<<i);
            if (!history.contains(possibleNextCode)){
                history.add(possibleNextCode);
                result.add(possibleNextCode);
                if (backtracking(n,history,result)){
                    return true;
                }
                history.remove(history.size()-1);
                result.remove(result.size()-1);
            }
        }
        
        return false;
    }
    
    public boolean differByOne(int x, int y){
        int diff = x ^ y;
        return diff != 0 && (diff & (diff-1)) == 0;
    }
}