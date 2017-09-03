package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OJ046_Permutations {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();
        backTrace(lists, nums, 0);
        return lists;
    }

    public void backTrace(List<List<Integer>> lists, int[] nums, int start){
        if(start == nums.length - 1){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++)
                list.add(nums[i]);
            lists.add(list);
            return;
        }
        for(int i = start; i < nums.length; i++){
            swap(nums, start, i);
            backTrace(lists, nums, start+1);
            swap(nums, start, i);
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
