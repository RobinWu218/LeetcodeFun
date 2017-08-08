public class Solution {
    public static Integer result;
    public int totalNQueens(int n) {
        result = 0;
        backtracking(n, 0, new ArrayList<>());
        return result;
    }
    
    public void backtracking(int n, int row, List<Integer>col){
        if (row == n){
            result++;
        }else{
            for (int i = 0; i<n; i++){
                col.add(i);
                if (isValid(col)){
                    backtracking(n,row+1,col);
                }
                col.remove(col.size()-1);
            }
        }
    }
    
    public boolean isValid(List<Integer>col){
        int rowID = col.size()-1;
        for (int i = 0; i<rowID; i++){
            int diff = Math.abs(col.get(i)-col.get(rowID));
            if (diff == 0 || diff == rowID-i){
                return false;
            }
        }
        return true;
    }
}