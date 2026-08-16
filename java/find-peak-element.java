class Solution {
    public int findPeakElement(int[] nums) {
      int low=0,mid=-1,high=nums.length-1;
    //   while(low<=high){
    //     mid=low+(high-low)/2;
        
    //     if(low==0){
    //         if(nums[low]>nums[low+1]){
    //             return low;
    //         }else
    //             low=1;
    //     }
    //     if(high==nums.length-1){
    //         if(nums[high]>nums[high-1]) return high;
    //         else high=high-1;
    //     }


    //     if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return mid;
    //     else{

    //     }
     while (low < high) {
            // Find mid point
             mid = low+(high-low)/2;

            // If mid element is greater than next
            if (nums[mid] > nums[mid + 1]) {
                // Move to left half
                high = mid;
            } else {
                // Move to right half
                low = mid + 1;
            }
        }

        // Return peak index
        return low;
    }

      }  
    
