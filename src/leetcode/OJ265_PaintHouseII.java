package leetcode;

public class OJ265_PaintHouseII {
	public int minCost(int[][] costs){
		int n = costs.length;
		if(n == 0)
			return 0;
		int k = costs[0].length;
		int[][] dp = new int[2][k];
		int now = 0, old = 0;
		
		for(int i = 0; i < n; i++){
			int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, index = -1;
			old = now;
			now = 1 - now;
			for(int j = 0; j < k; j++){
				if(dp[old][j] < min1){
					min2 = min1;
					min1 = dp[old][j];
					index = j;
				}else if(dp[old][j] < min2){
					min2 = dp[old][j];
				}
			}
			for(int j = 0; j < k; j++){
				if(j == index){
					dp[now][j] = min2 + costs[i][j];
				}else
					dp[now][j] = min1 + costs[i][j];
			}
		}
		int minCost = Integer.MAX_VALUE;
		for(int i = 0; i < k; i++){
			if(dp[now][i] < minCost)
				minCost = dp[now][i];
		}
		return minCost;
	}
}
