package leetcode;

public class OJ188_BestTimeSellStockIV {
	public static void main(String[] args){
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(3, prices));
	}
	public static int maxProfit(int k, int[] prices){
		if(k >= prices.length/2){
			int maxProfit = 0;
			for(int i = 1; i < prices.length; i++){
				maxProfit = maxProfit > maxProfit + (prices[i] - prices[i-1])? maxProfit : maxProfit + (prices[i] - prices[i-1]);
			}
			return maxProfit;
		}
		int[] buy = new int[k +1];
		int[] sell = new int[k + 1];
		for(int i = 1; i < buy.length; i++)
			buy[i] = Integer.MIN_VALUE; 
		for(int price : prices){
			for(int i = 1; i <= k; i++){
				buy[i] = Math.max(buy[i], sell[i-1] - price);
				sell[i] = Math.max(sell[i], buy[i] + price);
			}
		}
		return sell[k];
	}
}
