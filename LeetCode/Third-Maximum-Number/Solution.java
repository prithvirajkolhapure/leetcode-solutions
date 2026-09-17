1class Solution {
2    public int thirdMax(int[] nums) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        int count=1;
6        int max=nums[n-1];
7
8        for(int i=n-2;i>=0;i--){
9            if(nums[i]!=nums[i+1]){
10                count++;
11            if(count==3)
12                return nums[i];
13        }
14        }
15        return max;
16    }
17}
18
19// 1. Sort the array.
20
21// 2. Start from the largest element.
22
23// 3. Keep track of distinct numbers.
24
25// 4. When a different number is found:
26//       increase count.
27
28// 5. When count becomes 3:
29//       return that number.
30
31// 6. If 3 distinct numbers don't exist:
32//       return the largest number.