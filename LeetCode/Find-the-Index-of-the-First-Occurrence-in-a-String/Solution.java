1class Solution {
2    public int strStr(String haystack, String needle) {
3        int n=haystack.length();
4        int m=needle.length();
5
6        for(int i=0;i<=n-m;i++){
7            if(haystack.substring(i,i+m).equals(needle))
8                return i;
9            
10        }
11        return -1;
12    }
13}
14
15
16// Start
17//   ↓
18// Find n and m
19//   ↓
20// Start i = 0
21//   ↓
22// Take m characters from i
23//   ↓
24// Compare with needle
25//   ↓
26// Equal?
27//  ↙    ↘
28// Yes    No
29//  ↓      ↓
30// Return i  i++
31//           ↓
32//        Repeat
33//           ↓
34//        Return -1