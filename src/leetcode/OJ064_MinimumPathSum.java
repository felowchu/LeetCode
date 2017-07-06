package leetcode;

public class OJ064_MinimumPathSum {
	public static int minPathSum(int[][] gird){
		int row = gird.length;
		int col = gird[0].length;
		int[] dp = new int[col + 1];
		for(int i = 0; i <= col; i++)
			dp[i] = Integer.MAX_VALUE;
		for(int i = row - 1; i >= 0; i--){
			for(int j = col -1; j >=0; j--){
				if(i == row - 1 && j == col - 1){
					dp[j] = gird[i][j];
					continue;
				}
				dp[j] = gird[i][j] + Math.min(dp[j], dp[j + 1]); 
			}
		}
		return dp[0];
	}
}
