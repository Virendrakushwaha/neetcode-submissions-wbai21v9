class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = l+1;
        int maxPrices = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[l]<prices[r]){
             maxPrices = Math.max(prices[r]-prices[l],maxPrices);
             r++;
            }
            else{
                if(prices[l]>prices[r])
                l=r;
                r++;
            }
        }
        return maxPrices;
    }
}
