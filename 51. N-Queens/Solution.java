public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        backtracking(n,0,new ArrayList<Integer>(),result);
        return result;
    }
    
    public void backtracking(int n, int row, List<Integer> curCol, List<List<String>> result){
        if (n==row){
            List<String> colStr = constructCol(curCol);
            result.add(colStr);
        }else{
            for(int col = 0; col < n; col++){
                curCol.add(col);
                if (isValid(curCol)){
                    backtracking(n,row+1,curCol,result);
                }
                curCol.remove(curCol.size()-1);
            }
        }
    }
    
    public List<String> constructCol (List<Integer> col){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < col.size(); i++){
            int colNum = col.get(i);
            StringBuilder sb = new StringBuilder();
            int start = 0;
            while (start < col.size()){
                if (start == colNum){
                    sb.append('Q');
                }else{
                    sb.append('.');
                }
                start++;
            }
            result.add(sb.toString());
        }
        return result;
    }
    
    public boolean isValid (List<Integer> curCol){
        int rowID = curCol.size()-1;
        for (int i = 0; i<rowID; i++){
            int diff = Math.abs(curCol.get(i)-curCol.get(rowID));
            if (diff == 0 || diff == rowID - i){
                return false;
            }
        }
        return true;
    }
}