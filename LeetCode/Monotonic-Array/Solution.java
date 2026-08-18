1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean increasing=true;
4        boolean decreasing=true;
5
6        for(int i=1;i<nums.length;i++){
7            if(nums[i]>nums[i-1])
8                decreasing=false;
9
10            if(nums[i]<nums[i-1])
11                increasing=false;
12        }
13        return increasing||decreasing;
14    }
15}
16
17// 1. increasing = true
18// 2. decreasing = true
19
20// 3. Compare every element with previous element.
21
22// 4. If current < previous:
23//        increasing = false
24
25// 5. If current > previous:
26//        decreasing = false
27
28// 6. Return:
29//        increasing || decreasing