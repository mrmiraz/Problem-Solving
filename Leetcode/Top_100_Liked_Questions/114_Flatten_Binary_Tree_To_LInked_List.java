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
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        
        flatten(root.left);
        flatten(root.right);
        TreeNode tempRightNode = root.right;
        if(root.left != null){
            root.right = root.left;
            TreeNode tailLeftNode = root.left;
            
            while(tailLeftNode.right != null){
                tailLeftNode = tailLeftNode.right;
            }
            tailLeftNode.right = tempRightNode;
        }
        root.left = null;
        
    }
    
}

//https://www.youtube.com/watch?v=WR6-DrAsNpc