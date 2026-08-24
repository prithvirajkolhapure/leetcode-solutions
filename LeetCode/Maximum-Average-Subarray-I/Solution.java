1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3
4        int left = 0;
5        double sum = 0;
6        double result = Integer.MIN_VALUE;
7
8        for (int right = 0; right < nums.length; right++) {
9
10            // Add right element
11            sum += nums[right];
12
13            // Window reached size k
14            if (right - left + 1 == k) {
15
16                // Calculate average
17                double average = sum / k;
18
19                result = Math.max(result, average);
20
21                // Remove left element
22                sum -= nums[left];
23
24                // Move left
25                left++;
26            }
27        }
28
29        return result;
30    }
31}
32
33
34
35            //      SLIDING WINDOW
36            //            │
37            //            ▼
38            //   Add nums[right]
39            //            │
40            //            ▼
41            //  Window size == k ?
42            //      /           \
43            //    NO             YES
44            //    │               │
45            //    │               ▼
46            //    │         Calculate average
47            //    │               │
48            //    │               ▼
49            //    │         Update result
50            //    │               │
51            //    │               ▼
52            //    │         Remove nums[left]
53            //    │               │
54            //    │               ▼
55            //    │             left++
56            //    │               │
57            //    └───────┬───────┘
58            //            ▼
59            //        right++
60            //            │
61            //            ▼
62            //          DONE