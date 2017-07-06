package leetcode;

import java.util.List;

public class OJ139_wordBreak {
	public static boolean wordBreak(String s, List<String> wordDict){
		int n = s.length();
		boolean[] dp = new boolean[n + 1];
		dp[0] = true;
		for(int i = 1; i <= s.length(); i++){
			for(String str : wordDict){
				if(str.length() <= i){
					if(s.substring(i-str.length(),i).equals(str) && dp[i-str.length()])
						dp[i] = true;
				}
			}
		}
		return dp[n];
	}
}
