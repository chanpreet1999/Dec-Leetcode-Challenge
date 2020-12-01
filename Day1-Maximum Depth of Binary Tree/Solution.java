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
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int depth = 0;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while( !q.isEmpty() )
        {
            int size = q.size();
            while(size-- > 0)
            {
                TreeNode cur = q.remove();
                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right != null)
                    q.add( cur.right );
            }
            depth++;
        }
        return depth;
    }
}