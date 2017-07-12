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
    public List<Integer> preorderTraversal(TreeNode root) {
        Deque<TreeNode> path = new LinkedList<>();
        path.addFirst(root);
        List<Integer> result = new ArrayList<>();
        while (!path.isEmpty()){
            TreeNode cur = path.removeFirst();
            if (cur != null){
                result.add(cur.val);
                path.addFirst(cur.right);
                path.addFirst(cur.left);
            }
        }
        return result;
    }
}