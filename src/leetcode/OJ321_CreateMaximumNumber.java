package leetcode;

public class OJ321_CreateMaximumNumber {
	public static void main(String[] args){
		int[] nums1 = {6,7};
		int[] nums2 = {6,0,4};
		int k = 5;
		OJ321_CreateMaximumNumber maxnumber = new OJ321_CreateMaximumNumber();
		int[] result = maxnumber.maxNumber(nums1, nums2, k);
		for(int i = 0; i < k; i++)
			System.out.print(result[i] + " ");
	}
	public int[] maxNumber(int[] nums1, int[] nums2, int k){
		int len1 = nums1.length;
		int len2 = nums2.length;
		int[] res = new int[k]; 
		for(int i = Math.max(0, k - len2); i <= k && i <= len1; i++){
			int[] temp = merge(maxArray(nums1, i), maxArray(nums2, k - i), k);
			if(larger(temp, res, 0, 0))
				res = temp;
		}
		return res;
	}
	
	public int[] merge(int[] nums1, int[] nums2, int k){
		int[] res = new int[k];
		int j = 0, i = 0, r = 0;
		while(r < k){
			if(larger(nums1, nums2, i, j)) res[r++] = nums1[i++];
			else res[r++] = nums2[j++];
		}
		return res;
	}
	
	public boolean larger(int[] nums1, int[] nums2, int i, int j){
		while(i < nums1.length && j < nums2.length && nums1[i] == nums2[j]){
			i++;
			j++;
		}
		return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]); 
	}
	
	public int[] maxArray(int[] nums, int k){
		int n = nums.length;
		int[] res = new int[k];
		for (int i = 0, j = 0; i < n ; i++) {
			while (n - i + j > k && j > 0 && nums[i] > res[j - 1]) j--;
			if(j < k) res[j++] = nums[i];
		}
		return res;
	}
}
