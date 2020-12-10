/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {

    Stack<TreeNode> st; 
    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        addAllEle( root );
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode rv = st.pop();
        addAllEle( rv.right );
        return rv.val;
    }
    public void addAllEle( TreeNode node ){
        while( node != null )
        {
            st.push(node);
            node = node.left;
        }
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return st.size() != 0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */