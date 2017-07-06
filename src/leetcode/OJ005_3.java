package leetcode;

public class OJ005_3 {
	private static int lo = 0;
    private static int maxLen = 0;
	public static void main(String[] args){
		String s = "abbbsadda";
		System.out.println(longestPalindrome(s));
	}
	
	public static String longestPalindrome(String s){
		
		if(s.length() < 2){
			return s;
		}
		
		for(int i = 0; i < s.length()-1; i++){
			extendPalindrome(s, i, i);
			extendPalindrome(s, i, i+1);
		}
		return s.substring(lo, lo+maxLen);
	}
	
	public static void extendPalindrome(String s1, int j, int k){
		while(j>=0 && k < s1.length() && s1.charAt(j) == s1.charAt(k)){
			j--;
			k++;
		}
		if(maxLen < k - j -1){
			maxLen = k - j - 1;
			lo = j+1;
		}
	}
}
