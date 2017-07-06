package leetcode;

import java.util.TreeSet;

public class OJ363_MaxSumOfRectangleNoMoreThanK {
	public int maxSumSubmatrix(int[][] matrix, int k){
		int row = matrix.length;
		if(row == 0) return 0;
		int col = matrix[0].length;
		int m = Math.min(row, col);
		int n = Math.max(row, col);
		boolean colIsBig = (n ==col ? true : false);
		int res = Integer.MIN_VALUE;
		for(int i = 0; i < m; i++){
			int[] dp = new int[n];
			for(int j = i; j >= 0; j--){
				TreeSet<Integer> set = new TreeSet<Integer>();
				set.add(0);
				int val = 0;
				for(int x = 0; x < n; x++){
					dp[x] += (colIsBig ? matrix[j][x] : matrix[x][j]);
					val += dp[x];
					Integer sub = set.ceiling(val - k);
					if(sub != null){
						res = Math.max(res, val - sub);
					}
					set.add(val);
				}
			}
		}
		return res;
	}
}
