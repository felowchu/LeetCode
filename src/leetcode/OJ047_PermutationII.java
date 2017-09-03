package leetcode;

import java.util.ArrayList;
import java.util.List;

public class OJ047_PermutationII {
    public List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();
        permutation0(nums, lists, 0);
        return lists;
    }

    public void permutation0(int[] nums, List<List<Integer>> lists, int start){
        if(start == nums.length){
            List<Integer> list = new ArrayList<>();
           for(int i = 0 ; i < nums.length; i++)
               list.add(nums[i]);
           lists.add(list);
        }else{
            for(int i = start; i < nums.length; i++){
                if(noRepetition(nums, start, i)){
                    swap(nums, start, i);
                    permutation0(nums, lists, start+1);
                    swap(nums, i, start);
                }
            }
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public boolean noRepetition(int[] nums, int start, int end){
        if(start == end) return true;
        for(int i = start; i < end; i++){
            if(nums[i] == nums[end])
                return false;
        }
        return true;
    }
}
