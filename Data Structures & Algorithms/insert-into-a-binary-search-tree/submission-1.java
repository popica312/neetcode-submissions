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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            TreeNode newNode = new TreeNode(val);
            return newNode;
        }
        TreeNode current = root;
        TreeNode prev = null;
        while (current != null) {
            prev = current;
            if (current.val < val) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        if (prev.val < val) {
            prev.right = new TreeNode(val);
        } else {
            prev.left = new TreeNode(val);
        }

        return root;
    }
}