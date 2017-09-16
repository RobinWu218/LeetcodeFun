class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int curRow = 0, curCol = matrix[0].length-1;
        while (curRow < matrix.length && curCol >= 0){
            if (matrix[curRow][curCol] == target){
                return true;
            }
            
            if (matrix[curRow][curCol] > target){
                curCol--;
            }else{
                curRow++;
            }
        }
        return false;
    }
}