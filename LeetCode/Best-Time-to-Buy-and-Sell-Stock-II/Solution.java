1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit = 0;
4
5        for (int i = 1; i < prices.length; i++) {
6            if (prices[i] > prices[i - 1]) {
7                profit += prices[i] - prices[i - 1];
8            }
9        }
10
11        return profit;
12    }
13}
14
15//                 START
16//                   ↓
17//           profit = 0
18//                   ↓
19//           Start i = 1
20//                   ↓
21//        Is i < prices.length?
22//              /          \
23//            YES           NO
24//             ↓             ↓
25//  Compare prices[i]    return profit
26//  with prices[i-1]
27//             ↓
28//     Is current > previous?
29//         /          \
30//       YES           NO
31//        ↓             ↓
32//  current -        Do nothing
33//  previous            
34//        ↓             
35//  Add to profit 
36//        ↓
37//       i++
38//        ↓
39//    Repeat loop
40
41
42// 7 → 1   decrease → no profit
43// 1 → 5   increase → +4
44// 5 → 3   decrease → no profit
45// 3 → 6   increase → +3
46// 6 → 4   decrease → no profit