package leetcode;

import java.util.ArrayList;
import java.util.List;

public class OJ022_GenerateParentheses {
    public List<String> generateParenthesis(int n){
        List<String> list = new ArrayList<String>();
        backTrack(list,"",0,0,n);
        return list;
    }

    public void backTrack(List<String> list, String str, int open, int close, int pair){
        if(str.length() == pair*2){
            list.add(str);
            return;
        }
        if(open < pair){
            backTrack(list,str+"(",open+1,close,pair);
        }
        if(close < open){
            backTrack(list,str+")",open,close+1,pair);
        }
    }
}
