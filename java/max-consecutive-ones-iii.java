class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zerocount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zerocount++;
            
            if(zerocount>k)
            {
                if(nums[left]==0)
                    zerocount--;
                
            left++;
            } 
        }
        return nums.length-left;
    }
}