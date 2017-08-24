package leetcode;

public class OJ650_2KeysKeyboard {
    public int minSteps(int n){
        if(n <= 1) return 0;
        int[] dp = new int[n+1];
        for(int i = 2; i <= n; i++){
            dp[i] = i;
            for(int j = i - 1; j >= 2; j--){
                if(i % j == 0){
                    dp[i] = dp[j] + (i/j) - 1;
                }
            }
        }
        return dp[n];
    }
}
