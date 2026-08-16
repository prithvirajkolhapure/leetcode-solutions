// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//       int low=0,mid=-1,high=nums.length-1;
//       while(low<=high){
//         if(low==0){
//            if( nums[low]!=nums[low+1]) return nums[low];
//           else low=low+1;
//              }
//         else if(high==nums.length-1){
//             if(nums[high]!=nums[high-1]) return nums[high];
//             else high=high-1;
//         }
//         else{
//             mid=low+(high-low)/2;
//             if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1])
//                 return nums[mid];
//             else{
//                 if(nums[mid]==nums[mid+1])
//                     low=mid+1;
//                 else
//                     high=mid-1;
//             }
//         }
//       } return nums[mid]; 
//     }
// }
class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int low = 0, high = nums.length - 1;

        // while (low < high) {
        //     int mid = low + (high - low) / 2;

        //     // Ensure mid is even (pairs start at even index)
        //     if (mid % 2 == 1)
        //         mid--;

        //     // If pair is correct, unique element is on the right
        //     if (nums[mid] == nums[mid + 1]) {
        //         low = mid + 2;
        //     } 
        //     else {
        //         high = mid;
        //     }
        // }

        // return nums[low]; // low == high at unique element
        int result = 0; 
        for(int i : nums)
        {
            result ^= i; 
        }
        return result;
    }
}