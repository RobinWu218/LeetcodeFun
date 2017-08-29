class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rowZero = false, colZero = false;
        if (matrix.length == 0) return;
        if (matrix[0].length==0) return;
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++){
                if (matrix[i][j]==0){
                    if (i == 0) rowZero = true;
                    if (j == 0) colZero = true;
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        
        for (int i = 1; i<matrix.length;i++){
            for (int j = 1; j<matrix[0].length; j++){
                if (matrix[0][j] == 0 || matrix[i][0]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if (rowZero){
            for (int i = 0; i<matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        
        if (colZero){
            for (int i = 0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}