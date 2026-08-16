import java.lang.*;
class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE,maxprofit=0;

        
      for(int i=0;i<prices.length;i++){
        minprice=Math.min(minprice,prices[i]);
        int profit=prices[i]-minprice;
        maxprofit=Math.max(maxprofit,profit);
      }
      
        return maxprofit;
    }
}