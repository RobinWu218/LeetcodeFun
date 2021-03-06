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
    
    private int max;
    public int longestConsecutive(TreeNode root) {
        max = 0;
        if (root == null) return 0;
        helper(root, 0, root.val);
        return max;
    }
    
    public void helper(TreeNode root, int cur, int target){
        if (root == null) return;
        if (root.val == target){
            cur++;
        }else{
            cur = 1;
        }
        max = Math.max(max, cur);
        helper(root.left, cur, root.val+1);
        helper(root.right,cur,root.val+1);
    }
}