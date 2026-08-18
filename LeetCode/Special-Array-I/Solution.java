1class Solution {
2  public boolean isArraySpecial(int[] nums) {
3    for (int i = 1; i < nums.length; ++i)
4      if (nums[i] % 2 == nums[i - 1] % 2)
5        return false;
6    return true;
7  }
8}