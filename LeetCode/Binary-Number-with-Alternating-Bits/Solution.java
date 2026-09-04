1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        
4        int prev=n&1;
5        //n=n>>>1;
6        n = n >>> 1;
7
8        while(n!=0){
9            int curr=n&1;
10            if(prev==curr)
11                return false;
12
13            prev=curr;
14            n=n >>> 1;
15        }
16        return true;
17    }
18}
19
20
21// Get previous bit
22//        ↓
23// Shift right
24//        ↓
25// Get current bit
26//        ↓
27// Are they SAME?
28//    ↓           ↓
29//  YES           NO
30//  ↓             ↓
31// false       update prev
32//               ↓
33//           shift right
34//               ↓
35//             repeat