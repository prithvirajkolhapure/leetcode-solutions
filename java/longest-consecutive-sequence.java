// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashMap<Integer,Boolean> hm = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             hm.put(nums[i],false);
//         }

//         for(int key : hm.keySet()){
//             if(hm.containsKey(key-1)==false){
//                 hm.put(key,true);
//             }
//         }

//         int max = 0 ;
//         for(int key : hm.keySet()){
//             int k=1 ;
//             if(hm.get(key)==true){
//                 while(hm.containsKey(key+k)==true){
//                     k++;
//                 }
//             }
//             max = Math.max(max,k);
//         }
//         return max ;
//     }
// }


class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest = Integer.MIN_VALUE;
        int currLongest = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) 
                continue;
            if(nums[i] == nums[i - 1] + 1) {
                currLongest++;
            } else {
                longest = Math.max(longest, currLongest);
                currLongest = 1;
            }
        }
        return Math.max(longest, currLongest);
    }
}