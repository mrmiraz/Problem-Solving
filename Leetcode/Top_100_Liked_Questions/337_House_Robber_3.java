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
    public int rob(TreeNode root) {
        int[] result = helper(root);
        return Math.max(result[0], result[1]);
    }
    
    public int[] helper(TreeNode root){
        if(root == null) return new int[2];
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        
        int include = root.val + left[1]+ right[1];
        int exclude = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{include, exclude};
    }
}

//https://www.youtube.com/watch?v=nHR8ytpzz7c