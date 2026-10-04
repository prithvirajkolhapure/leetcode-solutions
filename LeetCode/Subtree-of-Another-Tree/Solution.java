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
16
17class Solution {
18    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
19
20        if (root == null)
21            return false;
22
23        if (same(root, subRoot))
24            return true;
25
26        return isSubtree(root.left, subRoot) ||
27               isSubtree(root.right, subRoot);
28    }
29
30    private boolean same(TreeNode p, TreeNode q) {
31
32        if (p == null && q == null)
33            return true;
34
35        if (p == null || q == null)
36            return false;
37
38        if (p.val != q.val)
39            return false;
40
41        return same(p.left, q.left) &&
42               same(p.right, q.right);
43    }
44}
45
46
47                // isSubtree(root, subRoot)
48                //          |
49                //          ↓
50                //   subRoot == null?
51                //     /          \
52                //   YES           NO
53                //    ↓             ↓
54                // TRUE         root == null?
55                //               /        \
56                //             YES         NO
57                //              ↓           ↓
58                //           FALSE       same(root, subRoot)?
59                //                       /          \
60                //                     YES           NO
61                //                      ↓             ↓
62                //                   TRUE       Search Left & Right
63                //                                    |
64                //                                    ↓
65                //               isSubtree(root.left, subRoot)
66                //                       ||
67                //               isSubtree(root.right, subRoot)
68                //                                    |
69                //                                    ↓
70                //                                 TRUE/FALSE