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
    public TreeNode searchBST(TreeNode root, int val) {
        return find(root,val);
    }
    public TreeNode find(TreeNode root, int value){
        if(root == null) return null;
        if(root.val == value) return root;

        if(root.val > value){
            return find(root.left, value);
        }
        else{
            return find(root.right, value);
        }
    }
}