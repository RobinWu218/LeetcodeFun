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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return checkTwoTrees(root.left, root.right);
    }
    
    public boolean checkTwoTrees(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if ((left == null && right != null)||(left != null && right == null))return false;
        
        if (left.val != right.val){
            return false;
        }else{
            return checkTwoTrees(left.left, right.right)&&checkTwoTrees(left.right, right.left);
        }
    }
}