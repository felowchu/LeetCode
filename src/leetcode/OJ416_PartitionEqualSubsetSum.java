package leetcode;

public class OJ416_PartitionEqualSubsetSum {
	public boolean canPartition(int[] nums){
		int n = nums.length;
		int sum = 0;
		int target = 0;
		for(int i = 0; i < n; i++){
			sum += nums[i];
		}
		if((sum & 1) != 0)
			return false;
		target = sum/2;
		boolean[] dp = new boolean[target + 1];
		dp[0] = true;
		for(int i = n - 1; i >= 0; i--){
			for(int j = target; j >= nums[i]; j--){
				dp[j] = dp[j - nums[i]] || dp[j];
			}
		}
		return dp[target];
	}
}
