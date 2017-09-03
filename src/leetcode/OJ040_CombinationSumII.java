package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OJ040_CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        backTrace(lists, list, candidates, target, 0);
        return lists;
    }

    public void backTrace(List<List<Integer>> lists, List<Integer> list, int[] nums, int target, int start){
        if(target < 0) return;
        if(target == 0) lists.add(new ArrayList<>(list));
        else {
            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i] == nums[i - 1]) continue;
                list.add(nums[i]);
                backTrace(lists, list, nums, target - nums[i], i+1);
                list.remove(list.size() - 1);
            }
        }
    }
}
