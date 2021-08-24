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
    public boolean isValidBST(TreeNode root) {
        return isBst(root, null, null);
    }
    public boolean isBst(TreeNode root, TreeNode min, TreeNode max){
        if(root == null){
            return true;
        }
        if(max != null && max.val <= root.val){
            return false;
        }
        if(min != null && min.val >= root.val){
            return false;
        }
        
        boolean isLeftValid = isBst(root.left, min, root);
        boolean isRightValid = isBst(root.right, root, max);
        return isLeftValid && isRightValid;
    }
}

//https://www.youtube.com/watch?v=_XgTN72fguk