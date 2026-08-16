// class Solution {
//     public int subarraysWithKDistinct(int[] nums, int k) {
//        int left=0;
//         int cnt=0;
//        for(int right=0;right<nums.length;right++){
//         map.put(nums[right],getOrDefault(nums[right])+1)
//         if(map.size()==2){
//             cnt++;
//         }
//         else
//         map.put(nums[left],getOrDefault(nums[left])-1);
//         if(get(nums[left])==0)
//             map.remove(nums[left]);
//         left++;
//        } 
//     }
// }


class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }

    public int atMost(int nums[],int k){
        HashMap<Integer,Integer> map= new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size()>k){
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);

                if(map.get(nums[left])==0)
                    map.remove(nums[left]);
                
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }



}