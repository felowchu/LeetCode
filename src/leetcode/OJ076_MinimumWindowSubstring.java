package leetcode;

public class OJ076_MinimumWindowSubstring {
    public String minWindow(String s, String t){
        int[] map = new int[128];
        for(int i = 0; i < t.length(); i++){
            map[t.charAt(i)]++;
        }
        int begin = 0, end = 0, counter = t.length(), head = 0, d = Integer.MAX_VALUE;
        while (end < s.length()){
            if(map[s.charAt(end++)]-- > 0) counter--;
            while (counter == 0){
                if(end - begin < d)
                     d = end -(head = begin);
                if(map[s.charAt(begin++)]++ == 0) counter++;
            }
        }
        return d == Integer.MAX_VALUE ? "" : s.substring(head, head+d);
    }
}
