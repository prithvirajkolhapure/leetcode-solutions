1class Solution {
2    public boolean validMountainArray(int[] arr) {
3        int n=arr.length;
4        if(n<3)
5            return false;
6
7        int i=0;
8        while(i+1<n && arr[i]<arr[i+1])
9            i++;
10        
11        if(i==0 || i==n-1)
12            return false;
13        
14        while(i+1<n && arr[i]>arr[i+1])
15            i++;
16
17        return i==n-1;
18    }
19}
20
21// 1. n < 3?
22//       ↓
23//    false
24
25// 2. Move UP
26//       ↓
27//    find peak
28
29// 3. Is peak first/last?
30//       ↓
31//    false
32
33// 4. Move DOWN
34//       ↓
35//    reach last element?
36
37// 5. yes → true
38//    no  → false