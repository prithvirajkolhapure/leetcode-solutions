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
17    public boolean isSymmetric(TreeNode root) {
18        
19    return dfs(root.left, root.right);
20    }
21
22    private boolean dfs(TreeNode root1, TreeNode root2) {
23        if (root1 == root2) {  //root1 = 2 root2 = 2 They are different objects, so:false
24            return true;
25        }
26        if (root1 == null || root2 == null || root1.val != root2.val) {
27            return false;
28        }
29        return dfs(root1.left, root2.right) && dfs(root1.right, root2.left);
30    }
31}
32
33
34// Algorithm
35// Start with the root's left and right children.
36// If both nodes are the same/null, return true.
37// If one node is null or their values differ, return false.
38// Compare:
39// left of first tree with right of second tree
40// right of first tree with left of second tree
41// Both comparisons must be true.