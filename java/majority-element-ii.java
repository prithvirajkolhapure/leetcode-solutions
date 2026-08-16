class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List <Integer> li=new ArrayList();
       int n=nums.length;
      // int m=n/3+1;
       int cnt1=0,cnt2=0,ele1=0,ele2=0;
       for(int i=0;i<n;i++){
        if(cnt1==0&&nums[i]!=ele2){
            cnt1=1;
            ele1=nums[i];
        }
        else if(cnt2==0&&nums[i]!=ele1){
            cnt2=1;
            ele2=nums[i];
        }
          else if(nums[i]==ele1)cnt1++;
          else if(nums[i]==ele2)cnt2++;
          else{
            cnt1--;cnt2--;
          } 
       }

         cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (num == ele1) cnt1++;
            else if (num == ele2) cnt2++;
        }    




         if (cnt1 > n / 3) li.add(ele1);
        if (cnt2 > n / 3) li.add(ele2);
       return li;
    }
}