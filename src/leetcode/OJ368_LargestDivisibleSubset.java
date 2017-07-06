package leetcode;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OJ368_LargestDivisibleSubset {
	public static void main(String[] args){
		int[] nums = {1,2,4,8};
		System.out.println(largestDividibleSubset(nums).toString());
	}
	public static List<Integer> largestDividibleSubset(int[] nums){
		List<Integer> list = new LinkedList<Integer>();
		int n = nums.length;
		Arrays.sort(nums);
		int[] dp = new int[n];
		int[] parent = new int[n];
		int maxLen = 0;
		int start = 0;
		for(int i = n - 1; i >= 0; i--){
			for(int j = i; j <= n - 1; j++){
				if(nums[j] % nums[i] == 0 && dp[i] < dp[j] + 1){
					dp[i] = dp[j] + 1;
					parent[i] = j; 
					if(maxLen < dp[i]){
						maxLen = dp[i];
						start = i;
					}
				}
			}
		}
		for(int i = 0; i < maxLen; i++){
			list.add(nums[start]);
			start = parent[start];
		}
		return list;
	}
}
