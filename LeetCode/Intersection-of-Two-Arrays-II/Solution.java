1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        // Store frequency of nums1
7        for (int num : nums1) {
8            map.put(num, map.getOrDefault(num, 0) + 1);
9        }
10
11        ArrayList<Integer> ans = new ArrayList<>();
12
13        // Check nums2
14        for (int num : nums2) {
15
16            if (map.getOrDefault(num, 0) > 0) {
17
18                ans.add(num);
19
20                map.put(num, map.get(num) - 1);
21            }
22        }
23
24        // Convert ArrayList to int[]
25        int[] result = new int[ans.size()];
26
27        for (int i = 0; i < ans.size(); i++) {
28            result[i] = ans.get(i);
29        }
30
31        return result;
32    }
33}
34
35
36// nums1
37//   ↓
38// Count frequency of every number
39//   ↓
40// HashMap
41
42// nums2
43//   ↓
44// Check whether number has remaining frequency
45//   ↓
46// YES → add to answer
47//   ↓
48// Decrease frequency by 1
49//   ↓
50// Convert ArrayList → int[]