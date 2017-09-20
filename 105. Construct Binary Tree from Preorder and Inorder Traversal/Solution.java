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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length, 0, inorder.length, map);
    }
    
    public TreeNode helper(int[]preorder,int preStart, int preEnd, int inStart, int inEnd, Map<Integer, Integer> map){
        if (preStart >= preEnd || inStart >= inEnd) return null;
        int rootInorder = map.get(preorder[preStart]);
        int leftSubSize = rootInorder - inStart;
        TreeNode leftTree = helper(preorder, preStart+1, preStart+1+leftSubSize, inStart, rootInorder, map);
        TreeNode rightTree = helper(preorder, preStart+1+leftSubSize, preEnd, rootInorder+1, inEnd, map);
        TreeNode newTree = new TreeNode(preorder[preStart]);
        newTree.left = leftTree;
        newTree.right = rightTree;
        return newTree;
    }
}