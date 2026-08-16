1class Solution {
2  public String addBinary(String a, String b) {
3    StringBuilder sb = new StringBuilder();
4    int carry = 0;
5    int i = a.length() - 1;
6    int j = b.length() - 1;
7
8    while (i >= 0 || j >= 0 || carry == 1) {
9      if (i >= 0)
10        carry += a.charAt(i--) - '0';
11      if (j >= 0)
12        carry += b.charAt(j--) - '0';
13      sb.append(carry % 2);
14      carry /= 2;
15    }
16
17    return sb.reverse().toString();
18  }
19}