package leetcode;

public class OJ309_BestTimeSellStockWithCoolDown {
	public int maxProfit(int[] prices){
		if(prices.length == 0)
			return 0;
		int buy = -prices[0], rest = 0, sell = 0;
		for(int i = 1; i < prices.length; i++){
			int preSell = sell;
			sell = buy + prices[i];
			buy = Math.max(rest - prices[i], buy);
			rest = Math.max(preSell, rest);
		}
		return Math.max(rest, sell);
	}
}
