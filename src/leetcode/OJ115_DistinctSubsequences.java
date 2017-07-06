package leetcode;

public class OJ115_DistinctSubsequences {
	public static void main(String[] args){
		System.out.println(numDistinct("rabbbit", "rabbit"));
	}
	public static int numDistinct(String s, String t){
		int lens = s.length();
		int lent = t.length();
		int[][] dp = new int[lent + 1][lens + 1];
		for(int i = 0; i < lens; i++)
			dp[0][i] = 1;
		for(int i = 1; i <= lent; i++){
			for(int j = 1; j <= lens; j++){
				if(s.charAt(j - 1) == t.charAt(i - 1))
					dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
				else
					dp[i][j] = dp[i][j-1];
			}
		}
		return dp[lent][lens];
	}
}
