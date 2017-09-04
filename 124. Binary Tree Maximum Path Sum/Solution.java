/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int maxVal;
    
    public int maxPathSum(TreeNode root) {
        maxVal = Integer.MIN_VALUE;
        helper(root);
        return maxVal;
    }
    
    public int helper(TreeNode root){
        if (root == null) return 0;
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        maxVal = Math.max (maxVal, left+right+root.val);
        return Math.max(left, right)+root.val;
    }
}