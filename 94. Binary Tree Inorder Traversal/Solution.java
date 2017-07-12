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
    public List<Integer> inorderTraversal(TreeNode root) {
        Deque <TreeNode> path = new LinkedList<>();
        TreeNode cur = root;
        List<Integer> result = new ArrayList<>();
        
        while(!path.isEmpty() || cur != null){
            if (cur != null){
                path.addFirst(cur);
                cur = cur.left;
            }else{
                cur = path.removeFirst();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }
}