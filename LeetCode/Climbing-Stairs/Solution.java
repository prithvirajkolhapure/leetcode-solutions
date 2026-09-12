1class Solution {
2  public int climbStairs(int n) {
3    int prev1 = 1; // dp[i - 1]
4    int prev2 = 1; // dp[i - 2]
5
6    for (int i = 2; i <= n; ++i) {
7      final int dp = prev1 + prev2;
8      prev2 = prev1;
9      prev1 = dp;
10    }
11
12    return prev1;
13  }
14}