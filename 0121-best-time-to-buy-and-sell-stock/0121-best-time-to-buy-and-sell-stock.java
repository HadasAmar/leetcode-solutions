class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0], profit=0, maxProfit=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min)
                min=prices[i];
            else{
                profit=prices[i]-min;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
}