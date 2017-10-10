class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m==0) return 0;
        int n = obstacleGrid[0].length;
        if (n==0) return 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i<n; i++){
            if (obstacleGrid[0][i]==1){
                break;
            }
            dp[0][i] = 1;
        }
        for (int j = 0; j<m; j++){
            if (obstacleGrid[j][0]==1){
                break;
            }
            dp[j][0] = 1;
        }
        
        for (int i = 1; i<n; i++){
            for (int j = 1; j<m; j++){
                if (obstacleGrid[j][i] != 1){
                    dp[j][i] = dp[j-1][i]+dp[j][i-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}