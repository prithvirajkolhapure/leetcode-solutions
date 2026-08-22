1// class Solution {
2//     public double findMaxAverage(int[] nums, int k) {
3//         int left=0;
4//         double ans=0;
5//         double result=Double.NEGATIVE_INFINITY;;
6
7//         if(nums.length==1)
8//             return nums[0];
9        
10//         for(int right=0;right<nums.length;right++){
11//                 ans+=nums[right];
12//                 if(right-left+1==k){
13//                     ans-=nums[left];
14//                     left++;
15//                 }
16//                 double temp=ans/k;
17//                 result=Math.max(temp,result);
18//         }
19//          return result;
20//     }
21// }
22
23
24
25
26class Solution {
27    public double findMaxAverage(int[] nums, int k) {
28
29        int left = 0;
30        double sum = 0;
31        double result = Double.NEGATIVE_INFINITY;
32
33        for (int right = 0; right < nums.length; right++) {
34
35            // Add right element
36            sum += nums[right];
37
38            // Window reached size k
39            if (right - left + 1 == k) {
40
41                // Calculate average
42                double average = sum / k;
43
44                result = Math.max(result, average);
45
46                // Remove left element
47                sum -= nums[left];
48
49                // Move left
50                left++;
51            }
52        }
53
54        return result;
55    }
56}