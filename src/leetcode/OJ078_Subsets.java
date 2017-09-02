package leetcode;

import java.util.ArrayList;
import java.util.List;

public class OJ078_Subsets {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        backTrace(list, subset, nums, 0);
        return list;
    }

    public void backTrace(List<List<Integer>> list, List<Integer> subset, int[] nums, int start){
        list.add(new ArrayList<Integer>(subset));
        for(int i = start; i < nums.length; i++){
            subset.add(nums[i]);
            backTrace(list, subset, nums, i+1);
            subset.remove(subset.size() - 1);
        }
    }
}
