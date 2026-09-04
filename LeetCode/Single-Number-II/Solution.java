1import java.util.Arrays;
2
3class Solution {
4    public int singleNumber(int[] nums) {
5        Arrays.sort(nums);
6
7        for (int i = 0; i < nums.length; i += 3) {
8            if (i + 2 >= nums.length || nums[i] != nums[i + 2]) {
9                return nums[i];
10            }
11        }
12
13        return -1;
14    }
15}
16
17
18//              Start
19//                ↓
20//           Sort the array
21//                ↓
22//           i = 0
23//                ↓
24//       Check nums[i] and nums[i+2]
25//                ↓
26//         Are they same?
27//           /          \
28//         YES           NO
29//          ↓             ↓
30//    Group of 3      Answer =
31//      is valid       nums[i]
32//          ↓
33//       i += 3
34//          ↓
35//        Repeat