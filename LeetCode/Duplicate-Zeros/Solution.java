1class Solution {
2    public void duplicateZeros(int[] arr) {
3
4        int n = arr.length;
5        int zeros = 0;
6
7        // Count zeros
8        for (int num : arr) {
9            if (num == 0)
10                zeros++;
11        }
12
13        int i = n - 1;
14        int j = n + zeros - 1;
15
16        while (i >= 0 && j >= 0) {
17
18            if (j < n)
19                arr[j] = arr[i];
20
21            if (arr[i] == 0) {
22                j--;
23
24                if (j < n)
25                    arr[j] = 0;
26            }
27
28            i--;
29            j--;
30        }
31    }
32}