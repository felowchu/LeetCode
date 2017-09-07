package DynamicProgram;

public class OJ072_EditDistance2 {
    public int distance(String word1, String word2){
        int m = word1.length();
        int n = word2.length();
        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++) dp[i] = i;
        for(int i = 1; i <= m; i++){
            int pre = i;int cur = 0;
            for(int j = 1; j <= n; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    cur = dp[j-1];
                }else
                    cur = Math.min(dp[j-1], Math.min(pre, dp[j]))+1;
                dp[j-1] = pre;
                pre = cur;
            }
            dp[n] = pre;
        }
        return dp[n];
    }
}
