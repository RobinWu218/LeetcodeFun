public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        if (m==0)return 0;
        int n = grid[0].length;
        if (n==0)return 0;
        int[][] result = new int[m][n];
        result[0][0] = grid[0][0];
        for (int i = 1; i<n;i++){
            result[0][i] = result[0][i-1] + grid[0][i];
        }
        for (int j = 1; j < m; j++){
            result[j][0] = result[j-1][0] + grid[j][0];
        }
        for (int i = 1; i< m; i++){
            for (int j = 1; j < n; j++){
                result[i][j] = Math.min(result[i-1][j]+grid[i][j], result[i][j-1]+grid[i][j]);
            }
        }
        return result[m-1][n-1];
    }
}