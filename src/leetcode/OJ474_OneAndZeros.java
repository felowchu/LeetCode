package leetcode;

public class OJ474_OneAndZeros {
	public int findMaxForm(String[] strs, int m, int n){
		int[][] dp = new int[m + 1][n + 1];
		for(String s : strs){
			int numOfZero = countOfZero(s);
			int numOfOne = s.length() - numOfZero;
			for(int i = m; i >= numOfZero; i--){
				for(int j = n; j >= numOfOne; j--){
					dp[i][j] = Math.max(dp[i][j], dp[i - numOfZero][j - numOfOne] + 1);
				}
			}
		}
		return dp[m][n];
	}
	
	public int countOfZero(String str){
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '0')
				count++;
		}
		return count;
	}
}
