package leetcode;

public class OJ213_HouseRobberII {
	public int rob(int[] nums){
		if(nums.length == 1) return nums[0];
		return Math.max(robCore(nums, 0, nums.length - 2) , robCore(nums, 1, nums.length - 1)); 
	}
	
	public int robCore(int[] nums, int start, int end){
		int a = 0, b = 0;
		for(int i = start; i <= end; i++){
			if(i%2 == 0) a = Math.max(b, a + nums[i]);
			else b = Math.max(a, b + nums[i]);
		}
		return Math.max(a, b);
	}
}
