1class Solution {
2    public int findNumbers(int[] nums) {
3        int cnt=0;
4
5        for(int num:nums){
6            int digit=0;
7
8            while(num>0){
9                digit++;
10                num=num/10;
11            }
12            if((digit&1)==0)//digit%2==0
13                cnt++;
14        }
15        return cnt;
16    }
17}
18
19// Array
20//   ↓
21// Take one number
22//   ↓
23// Count its digits
24//   ↓
25// Is digit count even?
26//    /          \
27//  YES          NO
28//   ↓            ↓
29// count++      ignore
30//   ↓            ↓
31// Take next number
32//   ↓
33// Repeat
34//   ↓
35// return count