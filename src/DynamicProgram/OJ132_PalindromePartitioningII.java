package DynamicProgram;

public class OJ132_PalindromePartitioningII {
    public int divide(String s){
        int n = s.length();
        int[] dp = new int[n+1];
        for(int i = 0; i <= n; i++) dp[i] = i-1;
        for(int i = 1; i <= n; i++){
            int j = 0;
            while(i-j >= 1 && i+j <= n && s.charAt(i-j-1) == s.charAt(i+j-1)){
                dp[i+j] = Math.min(dp[i - j - 1] + 1, dp[i+j]);
                j++;
            }
            j = 0;
            while(i-j > 1 && i+j<=n && s.charAt(i-j-2) == s.charAt(i+j-1)){
                dp[i+j] = Math.min(dp[i-j-2]+1, dp[i+j]);
                j++;
            }
        }
        return dp[n];
    }
}
