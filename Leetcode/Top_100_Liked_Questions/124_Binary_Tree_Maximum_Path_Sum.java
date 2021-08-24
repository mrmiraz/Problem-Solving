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
    
    int result;
    public int maxPathSum(TreeNode root) {
        this.result = Integer.MIN_VALUE;
        dfs(root);
        return this.result;
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(dfs(root.left),0);
        int right = Math.max(dfs(root.right),0);
        // find maximun from(left + root, right + root, root)
        int curResult  = Math.max(root.val,(root.val + Math.max(left,right)));
        // find maximum from(previous result, current entire subtree, current result from child root maximum)
        result = Math.max(result, Math.max(curResult, left+right+root.val));
        // return curResult because it can only compare to root 
        return curResult;
    }
}

//https://www.youtube.com/watch?v=TO5zsKtc1Ic