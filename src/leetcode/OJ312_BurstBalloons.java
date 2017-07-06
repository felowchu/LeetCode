package leetcode;

public class OJ312_BurstBalloons {
	public int maxCoins(int[] nums){
		int[] num = new int[nums.length];
		int n = 1;
		for(int i : nums)
			if(i > 0)
				num[n++] = i;
		num[0] = num[n++] = 1;
		int[][] dp = new int[n][n];
		for(int k = 2; k < n; k++){
			for(int left = 0; left < n - k; left++){
				int right = left + k;
				for(int i = left + 1; i < right; i++){
					dp[left][right] = Math.max(dp[left][right], num[left] * num[i] * num[right] + dp[left][i] + dp[i][right]);
				}
			}
		}
		return dp[0][n - 1];
	}
}
