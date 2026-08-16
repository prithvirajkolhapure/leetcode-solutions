import java.lang.Math;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int maxx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
               
            }
            else{
                 maxx=Math.max(cnt,maxx);
                cnt=0;
            }
        }
         maxx=Math.max(cnt,maxx);
        return maxx;

    }
}