class Solution {

         int firstN(int[] nums,int target){
                  int low=0,high=nums.length-1;
        int mid,first=-1,last=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
               high=mid-1;
            }
            else{
               low=mid+1;
            }
        }
        return first;
        }



          int lastN(int nums[],int target){
                  int low=0,high=nums.length-1;
        int mid,first=-1,last=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
               high=mid-1;
            }
            else{
               low=mid+1;
            }
        }
        return last;
        }


    public int[] searchRange(int[] nums, int target) {
      
     int a = firstN(nums, target);
        int b = lastN(nums, target);
        return new int[]{a, b};
       
    }
}
