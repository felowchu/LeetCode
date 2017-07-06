package leetcode;

public class OJ309_BestTimeSellStockWithCooldown2 {
	public int maxProfit(int[] prices){
		int sell = 0, preSell = 0, buy = Integer.MIN_VALUE;
		for(int i = 0; i < prices.length; i++){
			int prebuy = buy;
			buy = Math.max(preSell - prices[i], prebuy);
			preSell = sell;
			sell = Math.max(preSell, prebuy + prices[i]);
		}
		return sell;
	}
}
