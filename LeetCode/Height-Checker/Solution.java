1class Solution {
2    public int heightChecker(int[] heights) {
3        int expected[]=heights.clone();
4
5        Arrays.sort(expected);
6        int count=0;
7        for(int i=0;i<heights.length;i++){
8            if(heights[i]!=expected[i])
9                count++;
10        }
11        return count++;
12    }
13}
14
15
16// ORIGINAL ARRAY
17//       ↓
18//     COPY
19//       ↓
20//     SORT
21//       ↓
22//   COMPARE
23//       ↓
24// Count differences