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
    public int diameterOfBinaryTree(TreeNode root) {
    Deque<TreeNode> stack = new ArrayDeque<>();
    Deque<Integer> heights = new ArrayDeque<>();
    TreeNode curr = root, prev = null;
    int diameter = 0;

    while (curr != null || !stack.isEmpty()) {
        // Go as far left as possible
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }

        TreeNode top = stack.peek();
        if (top.right != null && top.right != prev) {
            // Right subtree not visited yet: go there first
            curr = top.right;
        } else {
            // Both subtrees done: process this node
            stack.pop();
            int r = (top.right != null) ? heights.pop() : 0;
            int l = (top.left != null) ? heights.pop() : 0;
            diameter = Math.max(diameter, l + r);
            heights.push(1 + Math.max(l, r));
            prev = top;
        }
    }
    return diameter;
}

}
