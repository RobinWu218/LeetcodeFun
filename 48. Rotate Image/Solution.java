class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length-1;
        for (int i = 0; i<(n+1)/2; i++){
            for (int j = i; j<n-i; j++){
                int temp1 = matrix[i][j];
                int temp2 = matrix[j][n-i];
                int temp3 = matrix[n-i][n-j];
                int temp4 = matrix[n-j][i];
                matrix[i][j] = temp4;
                matrix[j][n-i] = temp1;
                matrix[n-i][n-j] = temp2;
                matrix[n-j][i] = temp3;
            }
        }
    }
}