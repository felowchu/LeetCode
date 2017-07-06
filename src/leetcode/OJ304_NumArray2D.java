package leetcode;

public class OJ304_NumArray2D {
	int[][] dp;
	public OJ304_NumArray2D(int[][] matrix){
		int row = matrix.length;
		if(row == 0)
			return;
		int col = matrix[0].length;
		dp = new int[row + 1][col + 1];
		for(int i = 1; i <=row; i++){
			for(int j = 1; j <= col ;j++){
				dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
			}
		}
	}
	
	public int sumRegion(int row1, int col1, int row2, int col2){
		int jrow1 = Math.min(row1, row2);
		int jrow2 = Math.max(row1, row2);
		int jcol1 = Math.min(col1, col2);
		int jcol2 = Math.max(col2, col1);
		return dp[jrow2 + 1][jcol2 + 1] - dp[jrow2 + 1][jcol1]- dp[jrow1][jcol2 + 1] + dp[jrow1][jcol1];
	}
}
