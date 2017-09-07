package DynamicProgram;

public class OJ062_UniquePaths {
    public int path(int m, int n){
        if(m <= 0 || n <= 0) return 0;
        int[] dp = new int[n];
        for(int i = 0; i < n; i ++) dp[i] = 1;
        for(int i = m-2; i >= 0; i--){
            dp[n-1] = 1;
            for(int j = n-2; j >= 0; j--)
                dp[j] = dp[j+1] + dp[j];
        }
        return dp[0];
    }
}
