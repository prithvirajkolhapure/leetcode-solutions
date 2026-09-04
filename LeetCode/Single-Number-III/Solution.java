1class Solution {
2    public int[] singleNumber(int[] nums) {
3
4        int xor = 0;
5
6        // XOR all numbers
7        for (int num : nums) {
8            xor ^= num;
9        }
10
11        // Find a bit where the two unique numbers are different
12        int mask = xor & -xor;
13
14        int a = 0;
15        int b = 0;
16
17        // Divide numbers into two groups
18        for (int num : nums) {
19            if ((num & mask) != 0) {
20                a ^= num;
21            } else {
22                b ^= num;
23            }
24        }
25
26        return new int[]{a, b};
27    }
28}