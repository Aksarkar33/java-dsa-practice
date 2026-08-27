import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int result = MaxProfit(prices);
        System.out.println("Max Profit: " + result);
    }

    static int MaxProfit(int[] prices) {
        int buyPrices = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrices) {
                buyPrices = prices[i];
            } else {
                int current_profit = prices[i] - buyPrices;
                profit = Math.max(profit, current_profit);
            }
        }
        return profit;

    }

}
