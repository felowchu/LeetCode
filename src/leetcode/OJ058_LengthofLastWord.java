package leetcode;

public class OJ058_LengthofLastWord {
    public int lengthfLastWord(String s){
        s = s.trim();
        int n = s.length();
        int res = 0;
        for(int i = n-1; i >= 0; i--){
            if(s.charAt(i) != ' ')
                res++;
            else break;
        }
        return res;
    }
}
