package leetcode;

public class OJ376_WiggleSubsequence {
	public int wiggleMaxLength(int[] nums){
		if(nums.length < 2) return nums.length;
		int start = 1;
		while(start < nums.length && nums[start] == nums[start - 1])
			start++;
		if(start == nums.length)
			return 1;
		boolean increse = nums[start] > nums[start - 1];
		int pre = nums[start - 1];
		int len = 1;
		for(int i = start + 1; i < nums.length; i++){
			if((increse && nums[i] < pre) || (!increse && nums[i] > pre)){
				increse = !increse;
				len++;
			}
			pre = nums[i];
		}
		return len;
	}
}
