1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int l = 0;
4    int r = arr.length;
5
6    // Find the first index l s.t. nMissing(l) = A[l] - l - 1 >= k.
7    while (l < r) {
8      final int m = (l + r) / 2;
9      if (arr[m] - m - 1 >= k)
10        r = m;
11      else
12        l = m + 1;
13    }
14
15    // The k-th missing positive
16    // = A[l - 1] + k - nMissing(l - 1)
17    // = A[l - 1] + k - (A[l - 1] - (l - 1) - 1)
18    // = A[l - 1] + k - (A[l - 1] - l)
19    // = l + k
20    return l + k;
21    }
22}