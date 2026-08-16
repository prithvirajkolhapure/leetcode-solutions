class Solution {
    public int findMin(int[] nums) {
        int low=0,mid=-1,high=nums.length-1;
       int minn=Integer.MAX_VALUE;
 //    int minn=nums[0];
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){
                minn=Math.min(nums[low],minn);
                low=mid+1;
           }

            else{
              minn=Math.min(nums[mid],minn);
              high=mid-1; 
            }
        } return minn;
    }
}