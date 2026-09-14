1import java.lang.*;
2class Solution {
3    public int maxProfit(int[] prices) {
4        int minprice=Integer.MAX_VALUE,maxprofit=0;
5
6        
7      for(int i=0;i<prices.length;i++){
8        minprice=Math.min(minprice,prices[i]);
9        int profit=prices[i]-minprice;
10        maxprofit=Math.max(maxprofit,profit);
11      }
12      
13        return maxprofit;
14    }
15}