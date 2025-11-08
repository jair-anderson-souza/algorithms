public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int cheapest = Integer.MAX_VALUE, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - cheapest);
            cheapest = Math.min(cheapest, prices[i]);
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int result = BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1});
        System.out.println(result);
    }

}
