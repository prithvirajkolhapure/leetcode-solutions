class Solution {
    public int subarraySum(int[] nums, int k) {
      int currentSum=0,count=0;
      Map<Integer,Integer> prefix=new HashMap<>();
      prefix.put(0,1);

      for (int num : nums) {
         currentSum += num;//Add current ele in sum

          //check whether currentSum-k==0 if yes increment count, not 0 is assigned to count
        count += prefix.getOrDefault(currentSum - k, 0);

        prefix.put(currentSum,prefix.getOrDefault(currentSum, 0) + 1);

    }
    return count;
}
}


// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int currentSum = 0, count = 0;

//         Map<Integer, Integer> prefix = new HashMap<>();

//         // sum 0 has occurred once before starting (if sum-k becomes 0 then count should 1 
//         prefix.put(0, 1);

//         for (int num : nums) {

//             // 1. Calculate prefix sum
//             currentSum += num;

//             // 2. Check if currentSum - k occurred before
//             int need = currentSum - k;

//             if (prefix.containsKey(need)) {
//                 count += prefix.get(need);
//             }

//             // 3. Store currentSum frequency
//             prefix.put(
//                 currentSum,
//                 prefix.getOrDefault(currentSum, 0) + 1
//             );
//         }

//         return count;
//     }
// }