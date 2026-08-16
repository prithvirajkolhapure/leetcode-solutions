class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int n=numbers.length;
        int right=n-1;

        for(int i=0;i<n;i++){
           if( numbers[left] +numbers[right]==target)
            return new int[]{left+1,right+1};
            else if(numbers[left] +numbers[right]>target)
                right--;
            else
                left++;
        }
        return new int[]{};
    }
}