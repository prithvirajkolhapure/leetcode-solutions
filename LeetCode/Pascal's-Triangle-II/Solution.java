1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3         Integer[] ans = new Integer[rowIndex + 1];
4    Arrays.fill(ans, 1);
5
6    for (int i = 2; i < rowIndex + 1; ++i)
7      for (int j = 1; j < i; ++j)
8        ans[i - j] += ans[i - j - 1];
9
10    return Arrays.asList(ans);
11    }
12}