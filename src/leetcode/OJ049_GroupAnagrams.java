package leetcode;

import java.util.*;

public class OJ049_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> lists = new ArrayList<>();
        if(strs.length == 0) return lists;
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }
        lists.addAll(map.values());
        return lists;
    }
}
