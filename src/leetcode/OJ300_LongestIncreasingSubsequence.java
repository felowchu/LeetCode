package leetcode;

public class OJ300_LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums){
		int n = nums.length;
		if(n == 0)
			return 0;
		int[] dp = new int[n];
		for(int i = 0; i < n; i++)
			dp[i] = 1;
		for(int i = 1; i < n; i++){
			for(int j = i - 1; j >= 0; j--){
				if(nums[j] < nums[i] && dp[j] + 1 > dp[i]){
					dp[i] = dp[j] + 1;
				}
			}
		}
		int maxLen = 0;
		for(int i = 0; i < n; i++){
			if(dp[i] > maxLen)
				maxLen = dp[i];
		}
		return maxLen;
	}
}
