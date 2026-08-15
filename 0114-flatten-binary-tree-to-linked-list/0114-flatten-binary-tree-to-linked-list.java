/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        private TreeNode prev = null;
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        if(root == null) return ;
        flatten(curr.right);
        flatten(curr.left);

        curr.right = prev;
        curr.left = null;
        prev = curr;
    }
}