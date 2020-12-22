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
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return res;
    }
    
    int helper( TreeNode root ) {
        if(root == null)
            return 0;
        
        int lHeight = helper( root.left );
        int rHeight = helper( root.right );
        res = res && (Math.abs(rHeight - lHeight) <= 1);
        return Math.max( lHeight, rHeight ) + 1;
    }
    
}