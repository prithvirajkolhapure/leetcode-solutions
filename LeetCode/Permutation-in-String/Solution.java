1class Solution {
2  public boolean checkInclusion(String s1, String s2) {
3    int[] count = new int[26];
4    int required = s1.length();
5
6    for (final char c : s1.toCharArray())
7      ++count[c - 'a'];
8
9    for (int l = 0, r = 0; r < s2.length(); ++r) {
10      if (--count[s2.charAt(r) - 'a'] >= 0)
11        --required;
12      while (required == 0) {
13        if (r - l + 1 == s1.length())
14          return true;
15        if (++count[s2.charAt(l++) - 'a'] > 0)
16          ++required;
17      }
18    }
19
20    return false;
21  }
22}