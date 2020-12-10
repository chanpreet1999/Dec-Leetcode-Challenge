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

    ArrayDeque<Integer> q;
    public BSTIterator(TreeNode root) {
        q = new ArrayDeque<>();
        inorderMorris(root);
    }
    
    public int next() {
        return q.remove();
    }
    
    public boolean hasNext() {
        return !q.isEmpty();
    }
    
    private void inorderMorris( TreeNode root ) {
        if(root == null)
            return;
        
        TreeNode cur = root;
        while(cur != null)
        {
            if(cur.left != null) 
            {
                TreeNode rightMost = getRightMost( cur.left, cur );
                if(rightMost.right == null)
                {
                    rightMost.right = cur;
                    cur = cur.left;
                }
                else 
                {
                    q.add(cur.val);
                    cur = cur.right;
                }
            }
            else
            {
                q.add( cur.val );
                cur = cur.right;
            }
        }
    }
    
    private TreeNode getRightMost( TreeNode node, TreeNode cur )
    {
        TreeNode temp = node;
        while( temp.right != cur && temp.right != null )
            temp = temp.right;
        
        return temp;
    }

    
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */