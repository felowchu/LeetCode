package DynamicProgram;

public class OJ032_LongestValidParentheses2 {
    public static void main(String[] args){
        System.out.println(longest("()()"));
    }
    public static int longest(String s){
        int n = s.length();
        if(n == 0) return 0;
        int[] dp = new int[n];
        int res = 0;
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == ')'){
                if(i - dp[i - 1] >= 1 && s.charAt(i-dp[i-1]-1) == '(')
                     dp[i] = dp[i-1]+2;
                if(dp[i] > 0 && i - dp[i - 1] - 1 > 0)
                    dp[i] += dp[i - dp[i-1] - 2];
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }
}
