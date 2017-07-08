package leetcode;

public class OJ410_SplitArrayLargestSum {
	public int splitarray(int[] nums, int m){
		int left = 0, right = 0;
		for(int i = 0; i < nums.length; i++){
			left = Math.max(left, nums[i]);
			right += nums[i];
		}
		while(left < right){
			int mid = left + (right - left)/2;
			if(can_split(nums, mid, m)) right = mid;
			else left = mid + 1;
		}
		return left;
	}
	
	public boolean can_split(int[] nums, int mid, int m){
		int cnt = 1, curSum = 0;
		for(int i = 0; i < nums.length; i++){
			curSum += nums[i];
			if(curSum > mid){
				cnt++;
				curSum = nums[i];
				if(cnt > m) return false;
			}
		}
		return true;
	}
}
