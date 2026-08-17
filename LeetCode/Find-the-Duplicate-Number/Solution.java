1class Solution {
2    public int findDuplicate(int[] nums) {
3       HashMap<Integer,Integer> map=new HashMap<>();
4    int ans=-1;
5       for(int i=0;i<nums.length;i++){
6        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
7        if(map.get(nums[i])>1)
8            ans=nums[i];
9       } 
10       return ans;
11    }
12}