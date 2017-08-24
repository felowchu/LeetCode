package leetcode;

import java.util.HashSet;

public class OJ026_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] nums = {1232,217,217,217,2,13};
       System.out.println(removeDuplicates(nums));
    }
    public static int[] removeDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int[] result = new int[set.size()];
        int j = 0;
        for(int i: set){
            result[j++] = i;
        }
        return result;
    }
}
