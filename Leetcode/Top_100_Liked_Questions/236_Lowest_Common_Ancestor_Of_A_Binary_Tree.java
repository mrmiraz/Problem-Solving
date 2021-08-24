/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)return root;
        TreeNode left = lowestCommonAncestor(root.left, p , q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // if p and q fount both of the side 
        if(left != null && right != null)return root;
        if(left != null) return left;// if p and q found left side
        else return right; // if q found in the right side 
        
    }
}

//https://www.youtube.com/watch?v=13m9ZCB8gjw