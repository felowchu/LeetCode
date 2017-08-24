package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class OJ030_SubstringWithAllWords {
    public ArrayList<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = s.length();
        if(n == 0 || words.length == 0)
            return res;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            if(map.containsKey(words[i])){
                int count = map.get(words[i]);
                map.put(words[i], count + 1);
            }else
                map.put(words[i], 1);
        }
        int len1 = words[0].length();
        for(int i = 0; i < len1; i++){
            int left = i;
            int count = 0;
            HashMap<String, Integer> curMap = new HashMap<>();
            for(int j = i; j <= n - len1; j+=len1){
                String s1 = s.substring(j, j+len1);
                if(map.containsKey(s1)){
                    if(curMap.containsKey(s1)){
                        curMap.put(s1, curMap.get(s1)+1);
                    }else {
                        curMap.put(s1, 1);
                    }
                    if(curMap.get(s1) <= map.get(s1)){
                        count++;
                    }else{
                        while (curMap.get(s1) > map.get(s1)){
                            String str1 = s.substring(left, left+len1);
                            curMap.put(str1, curMap.get(str1) - 1);
                            if(curMap.get(str1) < map.get(str1)) count--;
                            left += len1;
                        }
                    }
                    if(count == words.length){
                        count--;
                        res.add(left);
                        String str2 = s.substring(left, left+len1);
                        curMap.put(str2, curMap.get(str2) - 1);
                        left += len1;
                    }
                }else{
                    curMap.clear();
                    count = 0;
                    left = j + len1;
                }

            }
        }
        return res;
    }
}
