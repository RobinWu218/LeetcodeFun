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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<>(), root, sum);
        return result;
    }
    
    public void backtracking(List<List<Integer>> result, List<Integer> cur, TreeNode root, int sum){
        if (root == null) return;
        if (root.left == null && root.right == null && sum == root.val){
            cur.add(root.val);
            result.add(new ArrayList<>(cur));
            cur.remove(cur.size()-1);
            return;
        }
        cur.add(root.val);
        backtracking(result, cur, root.left, sum - root.val);
        backtracking(result, cur, root.right, sum - root.val);
        cur.remove(cur.size()-1);
    }
}