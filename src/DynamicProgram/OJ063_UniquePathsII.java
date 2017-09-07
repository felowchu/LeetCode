package DynamicProgram;

public class OJ063_UniquePathsII {
    public int path(int[][] obstacleGrid){
        int m = obstacleGrid.length;
        if(m == 0) return 0;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1) return 0;
        int[] dp = new int[n+1];
        dp[n] = 0; dp[n-1] = 1;
        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(obstacleGrid[i][j] != 1)
                    dp[j] = dp[j+1] + dp[j];
                else dp[j] = 0;
            }
        }
        return dp[0];
    }
}
