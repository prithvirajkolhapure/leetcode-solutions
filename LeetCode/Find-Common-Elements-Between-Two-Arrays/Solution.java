1class Solution {
2    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
3        int ans1=0,ans2=0;
4        HashMap<Integer,Integer> map1=new HashMap<>();
5        for(int i=0;i<nums1.length;i++)
6            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
7           // map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
8
9        
10        for(int x:nums2){
11            if(map1.get(x)!=null)
12                ans2++;
13        }
14
15        HashMap<Integer,Integer> map2=new HashMap<>();
16        for(int i=0;i<nums2.length;i++)
17            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
18        
19        for(int x:nums1){
20            if(map2.get(x)!=null)
21                ans1++;
22        }
23        return new int[]{ans1,ans2};
24    }
25        
26}
27