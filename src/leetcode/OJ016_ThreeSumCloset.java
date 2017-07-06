package leetcode;

import java.util.Arrays;

public class OJ016_ThreeSumCloset {
	public int threeSumCloset(int[] nums, int target){
		Arrays.sort(nums);
		int res = Integer.MAX_VALUE;
		int abs = Integer.MAX_VALUE;
		for(int i = 0; i < nums.length - 2; i++){
			int lo = i + 1;
			int hi = nums.length - 1;
			while(lo < hi){
				int temp = target - nums[i] - nums[lo] - nums[hi];
				if(temp == 0){
					return target;
				}
				else if(temp > 0){
					if(temp < abs){
						abs = temp;
						res = nums[i] + nums[lo] + nums[hi];
					}
					lo++;
				}else{
					if(-temp < abs){
						abs = -temp;
						res = nums[i] + nums[lo] + nums[hi];
					}
					hi--;
				}
			}
		}
		return res;
	}
}
