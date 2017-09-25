package leetcode;

import java.util.ArrayList;
import java.util.List;

public class OJ077_Combinations {
    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> lists = new ArrayList<>();
        if(n < k) return lists;
        ArrayList<Integer> list = new ArrayList<>();
        combine0(lists, list,1, n, k);
        return lists;
    }

    private void combine0(List<List<Integer>> lists, List<Integer> list, int start, int end, int k){
        if(k == 0)
            lists.add(new ArrayList<>(list));
        else {
            for(int i = start; i <= end; i++){
                list.add(i);
                combine0(lists, list, i+1, end, k-1);
                list.remove(list.size() - 1);
            }
        }
    }
}
