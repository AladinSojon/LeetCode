// LC 226. Invert Binary Tree
// https://leetcode.com/problems/invert-binary-tree/

class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        // your code here
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
}
