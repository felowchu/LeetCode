package leetcode;

public class OJ123_BestTimeSellStockIII {
	public static void main(String[] args){
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices){
		int firstBuy = Integer.MIN_VALUE;
		int firstSell = 0;
		int secondBuy = Integer.MIN_VALUE;
		int secondSell = 0;
		for(int i : prices){
			firstBuy = Math.max(firstBuy, -i);
			firstSell = Math.max(firstSell, firstBuy + i);
			secondBuy = Math.max(secondBuy, firstSell - i);
			secondSell = Math.max(secondSell, secondBuy + i);
		}
		return secondSell;
	}
}
