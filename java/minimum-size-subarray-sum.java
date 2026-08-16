class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minLen=Integer.MAX_VALUE;
        int ans=0;

        for(int right=0;right<nums.length;right++){
            ans+=nums[right];
           while(ans>=target){
            minLen=Math.min(minLen,right-left+1);
            ans-=nums[left];
            left++;
           }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}