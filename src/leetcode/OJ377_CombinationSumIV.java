package leetcode;

import java.util.Arrays;

public class OJ377_CombinationSumIV {
	public int combinationSum4(int[] nums, int target){
		int[] cache = new int[target + 1];
		Arrays.fill(cache,-1);
		return combinationSum(nums, target, cache);
	}
	
	public int combinationSum(int[] nums, int target, int[] cache){
		if(target == 0)
			return 1;
		if(cache[target] != -1)
			return cache[target];
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			if(target >= nums[i])
				res += combinationSum(nums, target - nums[i], cache);
		}
		cache[target] = res;
		return res;
	} 
}
