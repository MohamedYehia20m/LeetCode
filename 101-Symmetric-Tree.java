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
    public boolean isSymmetricHelp(TreeNode r , TreeNode l)
    {
        if(r == null || l == null)
        return r==l;
        if(r.val != l.val)
        return false;
        else 
        return isSymmetricHelp(r.right , l.left) && isSymmetricHelp(r.left , l.right);
    }

    public boolean isSymmetric(TreeNode root) {
        TreeNode rr = root.right;
        TreeNode ll = root.left;
        return isSymmetricHelp(rr,ll);
    }
}