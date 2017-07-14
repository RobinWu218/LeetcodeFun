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
    
    private static class Status {
        public int numTargets;
        public TreeNode ancestor;
        public Status(int numTargets, TreeNode ancestor){
            this.numTargets = numTargets;
            this.ancestor = ancestor;
        }
        
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if (root == null || root == p || root == q) return root;
        // TreeNode leftAncestor = lowestCommonAncestor(root.left, p ,q);
        // TreeNode rightAncestor = lowestCommonAncestor(root.right, p ,q);
        // if (leftAncestor != null && rightAncestor != null) return root;
        // return leftAncestor == null? rightAncestor : leftAncestor;
        return helper(root,p,q).ancestor;
    }
    
    public Status helper(TreeNode root, TreeNode p, TreeNode q){
        if (root == null) return new Status(0, null);
        Status leftResult = helper (root.left, p, q);
        if (leftResult.numTargets == 2){
            return leftResult;
        }
        Status rightResult = helper (root.right, p, q);
        if (rightResult.numTargets == 2){
            return rightResult;
        }
        int numTargets = leftResult.numTargets + rightResult.numTargets + (root==p?1:0)+(root==q?1:0);
        return new Status(numTargets, (numTargets == 2? root: null));
        
    }
}