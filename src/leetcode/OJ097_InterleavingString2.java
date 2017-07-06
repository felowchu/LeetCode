package leetcode;

public class OJ097_InterleavingString2 {
	public static void main(String[] args){
		System.out.println(isInterleave("aabcc","dbbca","aadbbcbcac"));
	}
	public static boolean isInterleave(String s1, String s2, String s3){
		if(s1.length() + s2.length() != s3.length())
			return false;
		boolean[] dp = new boolean[s2.length() + 1];
		dp[0] = true;
		for(int i = 1; i <= s2.length(); i++){
			dp[i] = dp[i - 1] && (s2.charAt(i - 1) == s3.charAt(i - 1));
		}
		for(int i = 1; i <= s1.length(); i++){
			dp[0] = dp[0] && (s1.charAt(i - 1) == s3.charAt(i - 1));
			for(int j = 1; j <= s2.length(); j++){
				dp[j] = (dp[j - 1] && (s2.charAt(j - 1) == s3.charAt(i+j-1))) 
						|| (dp[j] && (s1.charAt(i - 1) == s3.charAt(i+j-1)));
			}
		}
		return dp[s2.length()];
	}
}
