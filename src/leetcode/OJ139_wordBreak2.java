package leetcode;

import java.util.List;

public class OJ139_wordBreak2 {
	public static boolean wordBreak(String s, List<String> wordDict){
		int n = s.length();
		boolean[] dp = new boolean[n + 1];
		dp[0] = true;
		for(int i = 1; i <= s.length(); i++){
			for(int j = 0; j < i; j++){
				if(dp[j] && wordDict.contains(s.substring(j,i))){
					dp[i] = true;
					break;
				}
			}
		}
		return dp[n];
	}
}
