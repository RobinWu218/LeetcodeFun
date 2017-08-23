class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if (n == 0) return result;
        int num = 1;
        for (int i = 0; i<n/2; i++){
            for (int j = i; j<n-i-1; j++){
                result[i][j]= num++;
            }
            
            for (int j = i; j<n-i-1;j++){
                result[j][n-i-1] = num++;
            }
            
            for (int j = n-i-1; j>i; j--){
                result[n-i-1][j] = num++;
            }
            
            for (int j = n-i-1; j>i; j--){
                result[j][i] = num++;
            }
        }
        if (n%2 != 0){
            result[(n-1)/2][(n-1)/2] = num;
        }
        return result;
    }
}