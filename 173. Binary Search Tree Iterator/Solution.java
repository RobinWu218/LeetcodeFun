/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    
    private Stack<TreeNode> myStack;
    
    public BSTIterator(TreeNode root) {
        myStack = new Stack<TreeNode>();
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !myStack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode cur = myStack.pop();
        pushAll(cur.right);
        return cur.val;   
    }
    private void pushAll(TreeNode cur){
        while(cur!=null){
            myStack.push(cur);
            cur = cur.left;
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */