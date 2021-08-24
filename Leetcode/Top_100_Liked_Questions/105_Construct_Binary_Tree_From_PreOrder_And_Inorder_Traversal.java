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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length-1, preorder, inorder);
    }
    
    public TreeNode helper(int prePointer, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(prePointer > preorder.length || inStart > inEnd) return null;
        
        TreeNode root = new TreeNode(preorder[prePointer]);
        int inIndex = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(root.val == inorder[i]){
                inIndex = i;
            }
        }
        
        root.left = helper(prePointer+1, inStart, inIndex-1, preorder, inorder);
        root.right = helper(prePointer + inIndex - inStart + 1, inIndex+1, inEnd, preorder, inorder);
        return root;
        
    }
}

//https://www.youtube.com/watch?v=PoBGyrIWisE
//https://www.youtube.com/watch?v=GeltTz3Z1rw