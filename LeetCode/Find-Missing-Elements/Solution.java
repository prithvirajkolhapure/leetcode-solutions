1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int mn = 100, mx = 0;
4        Set<Integer> s = new HashSet<>();
5        for (int x : nums) {
6            mn = Math.min(mn, x);
7            mx = Math.max(mx, x);
8            s.add(x);
9        }
10        List<Integer> ans = new ArrayList<>();
11        for (int x = mn + 1; x < mx; ++x) {
12            if (!s.contains(x)) {
13                ans.add(x);
14            }
15        }
16        return ans;
17    
18    }
19}