package leetcode;

import java.util.ArrayList;
import java.util.List;

public class OJ090_SubSetII {
    public List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backTrace(list, subset, nums, 0);
        return list;
    }

    public void backTrace(List<List<Integer>> list, List<Integer> subset, int[] nums, int start){
        list.add(new ArrayList<>(subset));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            subset.add(nums[i]);
            backTrace(list, subset, nums, i+1);
            subset.remove(subset.size()-1);
        }
    }
}
