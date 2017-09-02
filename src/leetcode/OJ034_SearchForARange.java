package leetcode;

public class OJ034_SearchForARange {
    public static void main(String[] args){
        OJ034_SearchForARange oj = new OJ034_SearchForARange();
        int[] nums = {5, 7, 7 ,8, 8, 10};
        int[] res = oj.searchRange(nums, 8);
        System.out.println(res[0] + " " + res[1]);
    }
    public int[] searchRange(int[] nums, int target){
        if(nums.length == 0) return new int[]{-1, -1};
        int lo = getFirst(nums, target);
        int hi = getLast(nums, target);
        return new int[]{lo, hi};
    }

    public int getFirst(int[] nums, int target){
        int lo = 0;
        int hi = nums.length - 1;
        while(lo < hi){
            int mid = (lo + hi)/2;
            if(nums[mid] == target && (mid == 0 || nums[mid - 1] != target)) return mid;
            if(nums[mid] >= target)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return nums[lo] == target ? lo : -1;
    }

    public int getLast(int[] nums, int target){
        int lo = 0;
        int hi = nums.length - 1;
        while(lo < hi){
            int mid = (lo + hi)/2;
            if(nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] != target)) return mid;
            if(nums[mid] <= target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return nums[lo] == target ? lo : -1;
    }
}
