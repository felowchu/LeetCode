package leetcode;

import java.util.Arrays;

public class OJ646_LongestPairChain {
    public int findLongestChain(int[][] pairs){
        if(pairs.length == 0) return 0;
        Arrays.sort(pairs, (a,b)-> (a[0] - b[0]));
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        for(int i = 0; i < pairs.length; i++){
            for(int j = 0; j < i; j++){
                dp[i] = Math.max(dp[i], (pairs[i][0] > pairs[j][1] ? dp[j] + 1 : dp[j]));
            }
        }
        return dp[pairs.length-1];
    }
}
