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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<Integer>();
        preOrder(root,lst);

        return lst;
    }


    public void preOrder(TreeNode root, List<Integer> lst){
        
        if(root == null) return;
        
        
        preOrder(root.left,lst);
        lst.add(root.val);
        preOrder(root.right,lst);



    }
}
