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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        
        if(root == null)
            return null;
        
        int lHeight = getHeight(root.left);
        int rHeight = getHeight(root.right);
        if(lHeight > rHeight)
            return subtreeWithAllDeepest(root.left);
        else if(rHeight > lHeight)
            return subtreeWithAllDeepest(root.right);
        else
            return root;
    }
    
    int getHeight(TreeNode root) 
    {
        if(root == null)
            return 0;
        
        return 1 + Math.max( getHeight(root.left), getHeight(root.right) );
    }
}