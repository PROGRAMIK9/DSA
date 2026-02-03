class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int profit = 0;
        int buy=prices[0];
        for(int i = 1; i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            else{
                int t = prices[i]-buy;
                profit = Math.max(t, profit);
            }
        }
        return profit;
    }
}