// class Solution {
//     public int maxProduct(int[] nums) {
//         int maxi=nums[0];
//         int mini=nums[0];
//         int prod=nums[0];
    
//         for(int i=1;i<nums.length;i++){
//             int curr=nums[i];

//             int option1=curr;
//             int option2=maxi*curr;
//             int option3=mini*curr;

//             maxi=Math.max(option1,Math.max(option2,option3));
//             mini=Math.min(option1,Math.min(option2,option3));
            
//             prod=Math.max(maxi,prod);
//         }
//         return prod;
//     }
// }

class Solution {
    public int maxProduct(int[] nums) {
        int suffix=1;
        int prefix=1;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;

        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;

            prefix*=nums[i];
            suffix*=nums[n-1-i];

            ans=Math.max(ans,Math.max(suffix,prefix));
        }
        return ans;
    }
}