package DynamicProgram;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class OJ140_WordBreakII {
    public List<String> wordBreak(String s, List<String> wordDict){
        HashMap<String, List<String>> map = new HashMap<>();
        return wordBreak0(s, wordDict, map);
    }

    public List<String> wordBreak0(String s, List<String> wordDict, HashMap<String, List<String>> cache){
        int n = s.length();
        List<String> list = new LinkedList<>();
        if(n == 0){
            list.add("");
            return list;
        }
        if(cache.containsKey(s)) return cache.get(s);

        for(String str : wordDict){
            if(s.startsWith(str)){
                List<String> temp = wordBreak0(s.substring(str.length()), wordDict, cache);
                for(String str1 : temp){
                    list.add(str + (str1.isEmpty() ? "" : (" " + str1)));
                }
            }
        }
        cache.put(s, list);
        return list;
    }
}
