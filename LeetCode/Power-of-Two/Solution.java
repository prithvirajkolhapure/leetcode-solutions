1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<=0)
4            return false;
5         
6         return (n&(n-1))==0;
7    }
8}
9
10
11// Power of 2
12//      ↓
13// Only ONE 1 in binary
14//      ↓
15// n & (n - 1)
16//      ↓
17// 0 → Power of 2
18
19
20// 🔍 Why does n & (n - 1) work?
21// Take:
22// n = 8
23// Binary:
24// 8     = 1000
25// 8 - 1 = 0111
26// Now:
27//   1000
28// & 0111
29// ------
30//   0000
31// So:
32// n & (n - 1) = 0
33// Therefore, 8 is a power of 2. ✅