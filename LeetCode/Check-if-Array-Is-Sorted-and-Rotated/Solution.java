1class Solution {
2    public boolean check(int[] nums) {
3        int count=0;
4       // int 
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>nums[(i+1)%nums.length])
7                count++;
8            if(count>1)
9                return false;
10        }
11        return true;
12    }
13}