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
17    public int minDepth(TreeNode root) {
18        if (root == null)
19            return 0;
20
21        int l = minDepth(root.left);
22        int r = minDepth(root.right);
23
24        if (l == 0)
25            return 1 + r;
26
27        if (r == 0)
28            return 1 + l;
29
30        return 1 + Math.min(l, r);
31    }
32}
33
34
35// Step-by-step
36// If root == null, return 0.
37// Find minimum depth of left subtree.
38// Find minimum depth of right subtree.
39// If left subtree doesn't exist, use right depth.
40// If right subtree doesn't exist, use left depth.
41// If both exist, take the minimum.
42// Add 1 for the current node.
43
44// Easy memory:
45// NULL → LEFT → RIGHT → HANDLE MISSING → MIN + 1