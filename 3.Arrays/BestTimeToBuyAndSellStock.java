class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i + 1 < prices.length; i++){
            int change = prices[i+1] - prices[i];
            if(change > 0){
                profit = profit + change;
            }
        }
        return profit;        
    }
}