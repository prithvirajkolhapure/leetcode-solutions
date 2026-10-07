1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int ans = Integer.MIN_VALUE;
18
19    public int maxPathSum(TreeNode root) {
20        dfs(root);
21        return ans;
22    }
23
24    private int dfs(TreeNode root) {
25
26        if (root == null)
27            return 0;
28
29        int left = Math.max(0, dfs(root.left));
30        int right = Math.max(0, dfs(root.right));
31
32        // Path passing through current node
33        int sum = left + root.val + right;
34
35        ans = Math.max(ans, sum);
36
37        // Return one side to parent
38        return root.val + Math.max(left, right);
39    }
40}