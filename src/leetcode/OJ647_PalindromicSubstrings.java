package leetcode;

public class OJ647_PalindromicSubstrings {
    public int count = 0;
    public int countSubstrings(String s){
        if(s.length() == 0) return 0;
        for(int i = 0; i < s.length(); i++){
            search(s, i, i);
            search(s, i, i+1);
        }
        return count;
    }

    public void search(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            right++;
            left--;
        }
    }
}
