package leetcode;

public class OJ132_PalindromePartitioningII2 {
	public static void main(String[] args){
		System.out.println(minCut("aacbcbabd"));
	}
	public static int minCut(String s){
		if(s.length() == 0)
			return 0;
		int n = s.length();
		boolean[][] pal = new boolean[n][n];
		int[] dp = new int[n];
		for(int i = n-1; i >= 0; i--){
			dp[i] = n - i - 1;
			for(int j = i; j < n; j++){
				if(s.charAt(i) == s.charAt(j) && (j - i < 2 || pal[i+1][j-1])){
					pal[i][j] = true;
					if(j == n - 1)
						dp[i] = 0;
					else
						dp[i] = Math.min(dp[i], dp[j+1] + 1);
				}
			}
		}
		return dp[0];
	}
}
