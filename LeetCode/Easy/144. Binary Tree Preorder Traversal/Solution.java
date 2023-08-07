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
    public List<Integer> preorderTraversal(TreeNode root) {
       
        List<Integer> lst= new ArrayList<Integer>();

        preOrder(root,lst);
        return lst;
    }

    void preOrder(TreeNode root, List<Integer> lst){

    if(root ==null) return;

     lst.add(root.val);
     preOrder(root.left, lst);
     preOrder(root.right, lst);

    }
}
