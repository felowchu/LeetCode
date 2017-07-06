package leetcode;

public class OJ375_GuessNumberHigherOrLowerII {
	public int getMoneyAmount(int n){
		int[][] t = new int[n + 1][n + 1];
		return dp(t, 1, n);
	}
	
	public int dp(int[][] t, int s, int e){
		if(s >= e) return 0;
		if(t[s][e] != 0) return t[s][e];
		int res = Integer.MAX_VALUE;
		for(int i = s; i <= e; i++){
			int temp = i + Math.max(dp(t, s, i-1), dp(t, i+1, e));
			res = Math.min(temp, res);
		}
		t[s][e] = res;
		return res;
	}
}
