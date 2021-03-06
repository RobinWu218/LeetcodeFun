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
    public int kthSmallest(TreeNode root, int k) {
        int count = countNodes(root.left);
        
        if (k <= count){
            return kthSmallest(root.left, k);
        }else if (count+1 < k){
            return kthSmallest(root.right, k-count-1);
        }
        return root.val;
        
    }
    
    public int countNodes (TreeNode root){
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}