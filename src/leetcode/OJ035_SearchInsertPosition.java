package leetcode;

import java.util.Arrays;

public class OJ035_SearchInsertPosition {
    public int searchInsert(int[] nums, int target){
        int i = Arrays.binarySearch(nums, target);
        if(i < 0) i = -(i + 1);
        return i;
    }
}
