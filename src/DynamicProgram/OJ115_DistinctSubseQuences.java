package DynamicProgram;

public class OJ115_DistinctSubseQuences {
    public int numDistinct(String s, String t){
        int m = s.length();
        int n = t.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i <= m; i++){
            int pre = 1;
            for(int j = 1; j <= n; j++){
                int cur = s.charAt(i-1) == t.charAt(j-1) ? dp[j] + dp[j-1] : dp[j];
                dp[j-1] = pre;
                pre = cur;
            }
            dp[n] = pre;
        }
        return dp[n];
    }
}
