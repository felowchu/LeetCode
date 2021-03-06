package leetcode;

public class OJ033_SearchInRotatedSortedArray {
    public int search(int[] nums, int target){
       int lo = 0, hi = nums.length - 1;
       while (lo < hi){
           int mid = (lo + hi)/2;
           if(nums[mid] == target) return mid;
           if(nums[lo] <= nums[mid]){
               if(target >= nums[lo] && target < nums[mid])
                   hi = mid - 1;
               else
                   lo = mid + 1;
           }else {
               if(target > nums[mid] && target <= nums[hi])
                   hi = mid + 1;
               else
                   lo = mid - 1;
           }
       }
       return nums[lo] == target ? lo : -1;
    }
}
