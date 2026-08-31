1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int validElementIndex = 0;
4      
5        // Iterate through each element in the array
6        for (int currentElement : nums) {
7            // If current element is not the value to be removed
8            if (currentElement != val) {
9                // Place it at the next valid position and increment the index
10                nums[validElementIndex] = currentElement;
11                validElementIndex++;
12            }
13        }
14      
15        // Return the count of valid elements (elements not equal to val)
16        return validElementIndex;
17    }
18}