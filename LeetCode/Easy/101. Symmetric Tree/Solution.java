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
    public boolean isSymmetric(TreeNode root) {
        boolean b = Symmetric(root,root);
        return b;
    }

    public boolean Symmetric(TreeNode p,TreeNode q){
        if(p==null || q==null){
        return(p==q);
        }

        return(p.val==q.val && Symmetric(p.left,q.right) && Symmetric(p.right,q.left));

    }
}
