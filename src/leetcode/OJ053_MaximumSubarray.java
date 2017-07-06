package leetcode;

public class OJ053_MaximumSubarray {
	public static void main(String[] args){
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubarray(nums));
	}
	public static int maxSubarray(int[] nums){
		int result = Integer.MIN_VALUE;
		int temp = 0;
		for(int i = 0; i < nums.length; i++){
			if(temp == 0 || temp < 0)
				temp = nums[i];
			else
				temp += nums[i];
			if(temp > result)
				result = temp;
		}
		return result;
	}
}
