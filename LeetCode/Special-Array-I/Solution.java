1class Solution {
2  public boolean isArraySpecial(int[] nums) {
3    for (int i = 1; i < nums.length; ++i)
4      if (nums[i] % 2 == nums[i - 1] % 2)
5        return false;
6    return true;
7  }
8}
9
10// 1. Start from the second element.
11
12// 2. Compare every element with the previous element.
13
14// 3. Find remainder when both are divided by 2.
15
16// 4. If both remainders are SAME:
17//        return false
18
19// 5. If all adjacent elements have different remainders:
20//        return true