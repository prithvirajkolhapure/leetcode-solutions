1class Solution {
2    public void rotate(int[] nums, int k) {
3
4        int n = nums.length;
5        k = k % n;
6
7        int[] result = new int[n];
8
9        for (int i = 0; i < n; i++) {
10            result[(i + k) % n] = nums[i];
11        }
12
13        for (int i = 0; i < n; i++) {
14            nums[i] = result[i];
15        }
16    }
17}