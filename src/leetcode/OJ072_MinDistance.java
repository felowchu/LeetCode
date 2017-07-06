package leetcode;

public class OJ072_MinDistance {
	public static void main(String[] args){
		String word1 = "cba";
		String word2 = "abad";
		System.out.println(minDistance(word1, word2));
	}
	public static int minDistance(String word1, String word2){
		int len1 = word1.length();
		int len2 = word2.length();
		int[] dp = new int[len2 + 1];
		for(int i = 1; i <= len2; i++)
			dp[i] = i;
		for(int i = 1; i <= len1; i++){
			int pre = i;
			for(int j = 1; j <= len2; j++){
				int cur = 0;
				if(word1.charAt(i-1) == word2.charAt(j-1))
					cur = dp[j - 1];
				else
					cur = Math.min(Math.min(dp[j - 1], pre), dp[j]) + 1;
				dp[j - 1] = pre;
				pre = cur;
			}
			dp[len2] = pre;
		}
		return dp[len2];
	}
}
