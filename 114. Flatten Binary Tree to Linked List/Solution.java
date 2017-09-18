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
    public void flatten(TreeNode root) {
        if (root == null) return;
        helper(root,null);
        
    }
    
    public TreeNode helper(TreeNode root, TreeNode prev){
        
        // TreeNode leftList = helper(root.left);
        // TreeNode rightList = helper(root.right);
        // TreeNode cur;
        // if (leftList != null){
        //     root.right = leftList;
        //     cur = leftList;
        //     while (cur.right != null){
        //         cur = cur.right;
        //     }
        //     cur.right = rightList;
        // }else{
        //     root.right = rightList;
        // }
        // root.left = null;
        // return root;
        if (root == null) return prev;
        prev = helper(root.right,prev);
        prev = helper(root.left,prev);
        root.right = prev;
        root.left = null;
        prev = root;
        return prev;
    }
}