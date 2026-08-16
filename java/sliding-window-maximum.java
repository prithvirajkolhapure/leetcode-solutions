class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int left=0;
        int idx=0;
        int[] temp=new int[nums.length-k+1];

        for(int right=0;right<nums.length;right++)
        {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            if(right-left+1==k)
            {
                temp[idx++]=map.lastKey();

                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)
                {
                map.remove(nums[left]);
                }
                left++;
            }

        }
        return temp;
    }
}