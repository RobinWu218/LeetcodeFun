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
    public boolean hasPathSum(TreeNode root, int sum) {
        return helper (root, sum, 0);
    }
    
    public boolean helper(TreeNode root, int sum, int temp){
        if (root == null) return false;
        temp += root.val;
        if (temp == sum && root.left == null && root.right == null){
            return true;
        }
        return (helper(root.left, sum, temp) || helper(root.right, sum, temp));
    }
}