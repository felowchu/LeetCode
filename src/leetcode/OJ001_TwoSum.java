package leetcode;

import java.util.HashMap;

public class OJ001_TwoSum {
	public static void main(String[] args){
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] a = twoSum(nums, target);
		System.out.println(a[0] +" "+ a[1]);
	}
	public static int[] twoSum(int[] nums, int target){
		int[] result = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(target - nums[i])){
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	}
}
