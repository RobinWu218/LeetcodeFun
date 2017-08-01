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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> curDepthNodes = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root==null) return result;
        curDepthNodes.offer(root);
        while (!curDepthNodes.isEmpty()){
            Queue<TreeNode> nextDepthNodes = new LinkedList<>();
            List<Integer> currentLevel = new ArrayList<>();
            while(!curDepthNodes.isEmpty()){
                TreeNode curNode = curDepthNodes.poll();
                if (curNode != null){
                    currentLevel.add(curNode.val);
                    nextDepthNodes.offer(curNode.left);
                    nextDepthNodes.offer(curNode.right);
                }
            }
            if (!currentLevel.isEmpty()){
                result.add(currentLevel);
            }
            curDepthNodes = nextDepthNodes;
        }
        return result;
        
    }
}