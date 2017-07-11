/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }
    
    public static int checkHeight(TreeNode root){
        if (root == null) return -1;
        
        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        if (Math.abs(leftHeight - rightHeight) > 1){
            return Integer.MIN_VALUE;
        }else{
            return Math.max(leftHeight, rightHeight)+1;
        }
    }   
}