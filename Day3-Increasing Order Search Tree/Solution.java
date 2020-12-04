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
    ArrayList<TreeNode> al;
    
    public TreeNode increasingBST(TreeNode root) {
        al = new ArrayList<>();
        inorder( root );
        
        for(int i = 0; i < al.size() - 1; i++ ) {
            al.get(i).right = al.get(i+1);
            al.get(i).left = null;
        }
        
        al.get( al.size() - 1 ).left = null;
        return al.get(0);
        
    }
    
    void inorder(TreeNode root) {
        
        if( root == null ) {
            return;
        }
        
        inorder( root.left );
        al.add( root );
        inorder(root.right);
    }
}