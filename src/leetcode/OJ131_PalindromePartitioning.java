package leetcode;

import java.util.ArrayList;
import java.util.List;

public class OJ131_PalindromePartitioning {
    public List<List<String>> partition(String s){
        List<List<String>> lists = new ArrayList<>();
        List<String> list = new ArrayList<>();
        backTrace(lists, list, s, 0);
        return lists;
    }

    public void backTrace(List<List<String>> lists, List<String> list, String s, int start){
        if(start == s.length()) lists.add(new ArrayList<>(list));
        else {
            for(int i = start; i < s.length(); i++){
                if(isPartition(s, start, i)){
                    list.add(s.substring(start, i+1));
                    backTrace(lists, list, s, i+1);
                    list.remove(list.size()-1);
                }
            }
        }
    }

    public boolean isPartition(String s, int left, int right){
        if(left == right) return true;
        while (left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else return false;
        }
        return true;
    }
}
