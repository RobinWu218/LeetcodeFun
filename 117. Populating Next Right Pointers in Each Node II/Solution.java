/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode cur = root, next = null, iter = null;
        while (cur != null){
            next = null;
            iter = null;
            while (cur != null){
                if (cur.left != null || cur.right != null){
                    if (next == null){
                        next = (cur.left != null)?cur.left : cur.right;
                        iter = next;
                    }
                    if (cur.left != null && iter != cur.left){
                        iter.next = cur.left;
                        iter = iter.next;
                    }
                    if (cur.right != null && iter != cur.right){
                        iter.next = cur.right;
                        iter = iter.next;
                    }
                }
                cur = cur.next;
            }
            cur = next;
        }
    }
}