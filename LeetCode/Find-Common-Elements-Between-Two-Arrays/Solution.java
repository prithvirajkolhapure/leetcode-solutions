1class Solution {
2    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
3        HashSet<Integer> set1=new HashSet<>();
4        HashSet<Integer> set2=new HashSet<>();
5
6        for(int i:nums1)
7            set1.add(i);
8
9        for(int i:nums2)
10            set2.add(i);
11
12        int ans1=0,ans2=0;
13
14        for(int i:nums1){
15            if(set2.contains(i))
16                ans1++;
17        }
18        for(int i:nums2){
19            if(set1.contains(i))
20                ans2++;
21        }
22
23        return new int[]{ans1,ans2};
24    }    
25}
26