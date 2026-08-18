1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer>set=new HashSet<>();
4
5        for(int i:nums1)
6            set.add(i);
7
8         HashSet<Integer>ans=new HashSet<>();
9
10         for(int i:nums2){
11            if(set.contains(i))
12                ans.add(i);
13         }
14         int i=0;
15        int result[]=new int[ans.size()];
16        for(int x:ans)
17            result[i++]=x;
18
19        return result;
20    }
21}
22
23// nums1
24//   ↓
25// Put everything in Set
26//   ↓
27// nums2
28//   ↓
29// Check each element in Set
30//   ↓
31// If present → put in ans
32//   ↓
33// Convert ans → array
34//   ↓
35// Return