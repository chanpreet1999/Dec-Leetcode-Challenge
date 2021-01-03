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
    public int pseudoPalindromicPaths (TreeNode root) {
        int occ[] = new int[10];
        return preorder( root, occ );
    }
    
    int preorder(TreeNode node, int[] occ)
    {
        if(node == null)
            return 0;
        
         occ[node.val]++;
        if( node.left == null && node.right == null && isPseudoPalindrome(occ) )
        {
            occ[node.val]--;
            return 1;
        }
        
        int count  = 0;
        
        count +=preorder( node.left, occ );
        count +=preorder( node.right, occ );
        
        occ[ node.val ]--;
        return count;
    }
    
    boolean isPseudoPalindrome(int[] occ)
    {
        boolean oddEncountered = false;
        for(int i = 1; i < occ.length; i++)
        {
            if( (occ[i] & 1) == 1 )
                if( oddEncountered )
                    return false;
                else
                    oddEncountered = true;
        }
        return true;
    }
    
    
}