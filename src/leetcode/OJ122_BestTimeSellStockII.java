package leetcode;

public class OJ122_BestTimeSellStockII {
	public static void main(String[] args){
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices){
		int[] dp = new int[prices.length];
		for(int i = 1; i < prices.length; i++){
			dp[i] = Math.max(dp[i-1], dp[i-1] + prices[i] - prices[i - 1]);
		}
		return dp[prices.length - 1];
	}
}
