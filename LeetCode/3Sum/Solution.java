1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3
4        List<List<Integer>> ans = new ArrayList<>();
5
6        Arrays.sort(nums);
7
8        for (int i = 0; i < nums.length - 2; i++) {
9
10            // Skip duplicate first elements
11            if (i > 0 && nums[i] == nums[i - 1])
12                continue;
13
14            int left = i + 1;
15            int right = nums.length - 1;
16
17            while (left < right) {
18
19                int sum = nums[i] + nums[left] + nums[right];
20
21                if (sum == 0) {
22
23                    ans.add(Arrays.asList(
24                        nums[i],
25                        nums[left],
26                        nums[right]
27                    ));
28
29                    left++;
30                    right--;
31
32                    // Skip duplicate left values
33                    while (left < right &&
34                           nums[left] == nums[left - 1])
35                        left++;
36
37                    // Skip duplicate right values
38                    while (left < right &&
39                           nums[right] == nums[right + 1])
40                        right--;
41
42                } else if (sum < 0) {
43                    left++;
44                } else {
45                    right--;
46                }
47            }
48        }
49
50        return ans;
51    }
52}