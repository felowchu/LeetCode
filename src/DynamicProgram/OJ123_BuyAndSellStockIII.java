package DynamicProgram;

public class OJ123_BuyAndSellStockIII {
    public int maxProfit(int[] prices){
        int firstBuy = Integer.MAX_VALUE, secondBuy = Integer.MAX_VALUE;
        int firstSell = 0, secondSell = 0;
        for(int price : prices){
            firstBuy = Math.min(firstBuy, price);
            firstSell = Math.max(firstSell, price-firstBuy);
            secondBuy = Math.min(secondBuy, price-firstSell);
            secondSell = Math.max(secondSell, price - secondBuy);
        }
        return secondSell;
    }
}
