package leetcode;

public class OJ392_IsSubsequence {
	public boolean isSubsequence(String s, String t){
		int m = s.length();
		int n = t.length();
		if(m > n) return false;
		int i = 0, j= 0;
		while(j < n && i < m){
			if(s.charAt(i) == t.charAt(j)){
				i++;
				j++;
			}else
				j++;
		}
		return i == m;
	}
}
