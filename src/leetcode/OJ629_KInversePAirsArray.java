package leetcode;

public class OJ629_KInversePAirsArray {
    public int kInversePairs(int n, int k) {
        int M = 1000000007;
        int[][] dp = new int[n+1][k+1];
        dp[0][0] = 1;
        for(int i = 1; i <= n ; i++){
            dp[i][0] = 1;
            for(int j = 1; j <= k; j++){
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % M;
                if(j >= i){
                    dp[i][j] = (dp[i][j] - dp[i-1][j-i] + M) % M;
                }
            }
        }
        return dp[n][k];
    }
}
