package DynamicProgramming;

public class BestTimetoBuyandSellStock121 {
    public static void main(String[] args) {
        int[] proce = {7,5,4,3,2,1};
        System.out.println(maxProfit(proce));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
}
