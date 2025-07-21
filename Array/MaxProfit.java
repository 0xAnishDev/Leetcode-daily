class Solution {
    public int maxProfit(int[] prices) {
        int max = prices[0];
        int min = prices[0];
        int profit = 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
                max = prices[i];
                continue;
            }
            profit = Math.max(profit, prices[i] - min);
            if(prices[i]>max){
                max = prices[i];
            }
        }
        return profit;
    }
}
