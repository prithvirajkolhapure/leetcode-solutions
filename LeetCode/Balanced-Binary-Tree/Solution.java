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
17    public boolean isBalanced(TreeNode root) {
18        return height(root) >= 0;
19    }
20
21    private int height(TreeNode root) {
22        if (root == null) {
23            return 0;
24        }
25        int l = height(root.left);
26        int r = height(root.right);
27        if (l == -1 || r == -1 || Math.abs(l - r) > 1) {
28            return -1;
29        }
30        return 1 + Math.max(l, r);
31    }
32}