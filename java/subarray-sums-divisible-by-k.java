// class Solution {
//     public int subarraysDivByK(int[] nums, int k) {
//         int sum=0;
//         int cnt=0;
//         HashMap<Integer,Integer>map=new HashMap<>();
//         map.put(0,1);//<remainder,frequecy i.e count>

//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];
//             int rem=sum % k;

//             if(rem<0)
//                 rem+=k;

//             if(map.containsKey(rem)){
//                 cnt+=map.get(rem);
//             }
//             map.put(rem,map.getOrDefault(rem,0)+1);
//         }
//         return cnt;
//     }
// }

class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int sum = 0;
        int count = 0;

        int[] freq = new int[k];

        // remainder 0 already occurred once
        freq[0] = 1;

        for (int num : nums) {

            sum += num;

            int rem = sum % k;

            // handle negative remainder
            if (rem < 0) {
                rem += k;
            }

            // add how many times this remainder appeared
            count += freq[rem];

            // increase frequency
            freq[rem]++;
        }

        return count;
    }
}