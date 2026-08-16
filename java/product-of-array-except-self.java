// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int total=1;
//         int []result=new int[nums.length];
//         for(int num:nums)
//             total*=num;
        
//         for(int i=0;i<nums.length;i++){
//             int curr=nums[i];
//             int ans=total/curr;
//             result[i]=ans;
//         }
//         return result;
//     }
// }

// class Solution {
//     public int[] productExceptSelf(int[] nums) {

//         int n = nums.length;
//         int[] result = new int[n];

//         int left = 1;

//         for (int i = 0; i < n; i++) {
//             result[i] = left;
//             left = left * nums[i];
//         }

//         int right = 1;

//         for (int i = n - 1; i >= 0; i--) {
//             result[i] = result[i] * right;
//             right = right * nums[i];
//         }

//         return result;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        // Step 1: Calculate prefix products and store them in ans
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        // Step 2: Calculate suffix products on the fly and multiply into ans
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return ans;
    }
}