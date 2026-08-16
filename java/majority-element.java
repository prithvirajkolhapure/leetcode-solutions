class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
       int ele=nums[0];
       int cnt=0;
       for(int i=0;i<n;i++){
            if(nums[i]==ele) cnt++;
            else cnt--;
            if(cnt==0){
                ele=nums[i];
                cnt=1;
            }
       } 
       return ele;
    }
}